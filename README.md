# TabPageLayout
Tab Page

## 环境配置
    allprojects {
        repositories {
          ...
          maven { url 'https://jitpack.io' }
        }
      }

        dependencies {
              implementation 'com.github.Wiser-Wong:BannerView:1.0.0'
      }
      
## 使用说明

    tabLayout.tabIds(R.id.ll_tab1, R.id.ll_tab2).setPages(R.id.tab_page_view, new HomeFragment(), new   MineFragment()).isTabCutPageAnim(false).setOnTabPageChangeListener(this)
            .setOnTabClickListener(this).isPageCanScroll(false).setOnTabSwitchPageListener(this).isDefaultOnPageSelected(true);
            
            
