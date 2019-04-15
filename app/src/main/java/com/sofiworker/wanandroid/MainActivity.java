package com.sofiworker.wanandroid;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.sofiworker.wanandroid.fragment.HomeFragment;
import com.sofiworker.wanandroid.fragment.KnowledgeFragment;
import com.sofiworker.wanandroid.fragment.NavigationFragment;
import com.sofiworker.wanandroid.fragment.ProjectFragment;
import com.sofiworker.wanandroid.fragment.PublicNumberFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * 该活动主要是用于进入app的主页面
 */

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mainDrawer;
    private List<Fragment> mFragmentList = new ArrayList<>();
    private BottomNavigationView mMainBtmNav;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_main, menu);
        return true;
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //初始化界面
        initLayout();

        HomeFragment homeFragment = HomeFragment.getInstance();
        KnowledgeFragment knowledgeFragment = KnowledgeFragment.getInstance();
        NavigationFragment navigationFragment = NavigationFragment.getInstance();
        ProjectFragment projectFragment = ProjectFragment.getInstance();
        PublicNumberFragment publicNumberFragment = PublicNumberFragment.getInstance();
        mFragmentList.add(homeFragment);
        mFragmentList.add(knowledgeFragment);
        mFragmentList.add(navigationFragment);
        mFragmentList.add(projectFragment);
        mFragmentList.add(publicNumberFragment);

//        mMainBtmNav.setSelectedItemId(R.id.bottom_nav_item_home);
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.add(R.id.fl_main, homeFragment);
//        fragmentTransaction.commit();
    }

    //初始化主界面
    private void initLayout(){
        Toolbar toolbar = findViewById(R.id.toolbar_main);
        toolbar.setNavigationIcon(R.drawable.ic_action_menu);
        setSupportActionBar(toolbar);

        mainDrawer = findViewById(R.id.drawer_main);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainDrawer.openDrawer(GravityCompat.START);
            }
        });
        
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                int id = menuItem.getItemId();
                switch (id){
                    case R.id.toolbar_search:
                        // TODO: 2019/4/14 搜索 
                        break;
                    default:
                        break;
                }
                return false;
            }
        });

        mMainBtmNav = findViewById(R.id.bottom_nav_main);
        mMainBtmNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                switch (id){
                    // TODO: 2019/4/15 碎片的切换
                    case R.id.bottom_nav_item_home:
                        if (mFragmentList.contains(HomeFragment.getInstance())){
                            fragmentTransaction.add(R.id.fl_main, HomeFragment.getInstance());
                        }
                        break;
                    case R.id.bottom_nav_item_know:
                        if (mFragmentList.contains(KnowledgeFragment.getInstance())){
                            fragmentTransaction.replace(R.id.fl_main, KnowledgeFragment.getInstance());
                        }
                        break;
                    case R.id.bottom_nav_item_nav:
                        if (mFragmentList.contains(NavigationFragment.getInstance())){
                            fragmentTransaction.replace(R.id.fl_main, NavigationFragment.getInstance());
                        }
                        break;
                    case R.id.bottom_nav_item_public_num:
                        if (mFragmentList.contains(PublicNumberFragment.getInstance())){
                            fragmentTransaction.replace(R.id.fl_main, PublicNumberFragment.getInstance());
                        }
                        break;
                    case R.id.bottom_nav_item_project:
                        if (mFragmentList.contains(ProjectFragment.getInstance())){
                            fragmentTransaction.replace(R.id.fl_main, ProjectFragment.getInstance());
                        }
                        break;
                    default:
                        break;
                }
                fragmentTransaction.commit();
                return true;
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (mainDrawer.isDrawerOpen(GravityCompat.START)){
            mainDrawer.closeDrawers();
        }else {
            finish();
        }
    }
}
