package com.taobao.tao.topmultitab.service.view;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.service.base.IHomePageService;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface IHomeViewService extends IHomePageService {
    public static final String SERVICE_NAME = "HomeViewService";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(729810397);
            t2o.a(729810398);
        }

        @Override // com.taobao.tao.topmultitab.service.view.IHomeViewService.b
        public void onPageScrollStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            }
        }

        @Override // com.taobao.tao.topmultitab.service.view.IHomeViewService.b
        public void onPageScrolled(int i, float f, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            }
        }

        @Override // com.taobao.tao.topmultitab.service.view.IHomeViewService.b
        public void onPageSelected(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db26523d", new Object[]{this, new Integer(i), str});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
        void onPageScrollStateChanged(int i);

        void onPageScrolled(int i, float f, int i2);

        void onPageSelected(int i, String str);
    }

    void addOnPageChangeListener(b bVar);

    void compensateOnPageSelected(String str);

    void createView(View view);

    void destroyView();

    List<String> getAllTabType();

    int getCurrentTabIndex();

    JSONObject getCurrentTabItem();

    String getDefaultPageType();

    int getPosByType(String str);

    List<JSONObject> getTabItems();

    String getTypeByPos(int i);

    boolean isScrolling();

    boolean isSelectedByTopMultiTab();

    void postScrollToCurrentPosMessage();

    void preCreateMultiTabView(View view);

    void reRenderItem(String str);

    void reSetTabItems(List<JSONObject> list, boolean z);

    void removeOnPageChangeListener(b bVar);

    void selectTab(JSONObject jSONObject);

    void selectTab(String str);

    void setSelectedByTopMultiTab(boolean z);

    void updatePageViewPadding();

    void updateTabListData(List<JSONObject> list);
}
