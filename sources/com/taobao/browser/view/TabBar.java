package com.taobao.browser.view;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.pg1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TabBar extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context mCtx;
    private TabBarItem mCurrentItem = null;
    private WVCallBackContext wvContext = null;
    public View.OnClickListener clickListener = new View.OnClickListener() { // from class: com.taobao.browser.view.TabBar.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (view instanceof TabBarItem) {
                TabBarItem tabBarItem = (TabBarItem) view;
                TabBar.access$000(TabBar.this).doClick(false);
                tabBarItem.doClick(true);
                TabBar.access$002(TabBar.this, tabBarItem);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", TabBar.access$000(TabBar.this).getItemId());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                TabBar.access$100(TabBar.this).fireEvent("WV.Event.TabBar.clicked", jSONObject.toString());
            }
        }
    };

    static {
        t2o.a(619708666);
    }

    public TabBar(Context context) {
        super(context);
        this.mCtx = context;
    }

    public static /* synthetic */ TabBarItem access$000(TabBar tabBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabBarItem) ipChange.ipc$dispatch("66671a0c", new Object[]{tabBar});
        }
        return tabBar.mCurrentItem;
    }

    public static /* synthetic */ TabBarItem access$002(TabBar tabBar, TabBarItem tabBarItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabBarItem) ipChange.ipc$dispatch("662af03c", new Object[]{tabBar, tabBarItem});
        }
        tabBar.mCurrentItem = tabBarItem;
        return tabBarItem;
    }

    public static /* synthetic */ WVCallBackContext access$100(TabBar tabBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVCallBackContext) ipChange.ipc$dispatch("aac6205a", new Object[]{tabBar});
        }
        return tabBar.wvContext;
    }

    public static /* synthetic */ Object ipc$super(TabBar tabBar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/view/TabBar");
    }

    public RelativeLayout createLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RelativeLayout) ipChange.ipc$dispatch("cd9451d", new Object[]{this});
        }
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(this.mCtx).inflate(R.layout.flowbar_top, (ViewGroup) null);
        RadioGroup radioGroup = (RadioGroup) relativeLayout.findViewById(R.id.flowbar_top);
        radioGroup.setPadding(16, 20, 16, 20);
        radioGroup.setBackgroundColor(-1118482);
        radioGroup.addView(this);
        return relativeLayout;
    }

    public void init(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a71fc5e", new Object[]{this, str, wVCallBackContext});
            return;
        }
        this.wvContext = wVCallBackContext;
        try {
            JSONObject jSONObject = new JSONObject(str);
            init(jSONObject.getJSONArray("buttons"), jSONObject.optString("selectedId"));
        } catch (JSONException unused) {
        }
    }

    private void init(JSONArray jSONArray, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fc6c03b", new Object[]{this, jSONArray, str});
            return;
        }
        LinearLayout linearLayout = new LinearLayout(this.mCtx);
        linearLayout.setOrientation(0);
        int width = (((WindowManager) this.mCtx.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getWidth() - 40) / jSONArray.length();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String optString = jSONObject.optString("text");
                String optString2 = jSONObject.optString("id");
                LinearLayout linearLayout2 = (LinearLayout) LayoutInflater.from(this.mCtx).inflate(R.layout.tabbar_item, (ViewGroup) null);
                TabBarItem tabBarItem = new TabBarItem(this.mCtx, linearLayout2);
                if (i == 0) {
                    tabBarItem.setButton(optString, width, 1);
                } else if (i == jSONArray.length() - 1) {
                    tabBarItem.setButton(optString, width, 2);
                } else {
                    tabBarItem.setButton(optString, width, 0);
                }
                if (optString2.equals(str)) {
                    this.mCurrentItem = tabBarItem;
                    tabBarItem.doClick(true);
                }
                tabBarItem.addView(linearLayout2);
                linearLayout.addView(tabBarItem);
                tabBarItem.setOnClickListener(this.clickListener);
                tabBarItem.setItemId(optString2);
            } catch (JSONException unused) {
                return;
            }
        }
        addView(linearLayout);
    }
}
