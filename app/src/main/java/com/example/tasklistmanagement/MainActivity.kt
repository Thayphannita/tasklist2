package com.example.tasklistmanagement

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatDialogFragment
import androidx.fragment.app.Fragment
import com.example.tasklistmanagement.BottomFragement.TodayTaskFragment
import com.example.tasklistmanagement.BottomFragement.TomorrowTaskFragment
import com.example.tasklistmanagement.BottomFragement.YesterdayTaskFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow,
                R.id.nav_tools, R.id.nav_share, R.id.nav_send
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)


        //Bottom navigation
        bottom_navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

        private fun replaceFragment (fragment: Fragment)
        {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragementConstrain,fragment)
            fragmentTransaction.commit()
        }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    //Bottom Navigation

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener {item->
        when(item.itemId){
        R.id.bottom_nav_all_task  -> {
            println("Home press")
            replaceFragment(YesterdayTaskFragment())
            return@OnNavigationItemSelectedListener true
        }
            R.id.bottom_nav_yesterday -> {
                println("Home press")
                replaceFragment(TodayTaskFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.bottom_nav_todaytask -> {
                println("Home press")
                replaceFragment(TomorrowTaskFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.bottom_nav_tom_task -> {
                println("Home press")
                replaceFragment(TomorrowTaskFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.bottom_nav_addtask -> {
                println("Home press")
                replaceFragment(TomorrowTaskFragment())
                return@OnNavigationItemSelectedListener true
            }
    }; false

    }
}
