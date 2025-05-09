package com.taobao.share.ui.engine.render;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.ui.engine.jsbridge.TBWeexShare;
import com.taobao.statistic.TBS;
import com.ut.share.business.interf.IShareContainer;
import java.util.Map;
import org.json.JSONObject;
import tb.bwr;
import tb.oj8;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PanelWindow extends PopupWindow {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public FrameLayout container;
    private BroadcastReceiver dismissReceiver = new BroadcastReceiver() { // from class: com.taobao.share.ui.engine.render.PanelWindow.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/share/ui/engine/render/PanelWindow$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            TBShareContent e;
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            try {
                z = new JSONObject(intent.getStringExtra("data")).getBoolean("isClickCancel");
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (z && (e = bwr.h().e()) != null) {
                String str = e.businessId;
                TBS.Ext.commitEvent("Page_Share", 19999, "Cancel", str, null, e.businessId + "," + e.templateId + ",0," + ShareBizAdapter.getInstance().getLogin().getUserId());
            }
            PanelWindow.this.dismiss();
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                PanelWindow.this.dismiss();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
    }

    static {
        t2o.a(667942962);
    }

    public PanelWindow(Activity activity) {
        FrameLayout createContainer = createContainer(activity);
        this.container = createContainer;
        if (createContainer != null) {
            setContentView(createContainer);
            setWidth(-1);
            setHeight(-1);
            setSoftInputMode(16);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(TBWeexShare.ACTION_CLOSE_SHARE_PANEL);
            intentFilter.addAction("share_receiver_close_share_menu");
            LocalBroadcastManager.getInstance(ShareBizAdapter.getInstance().getAppEnv().getApplication()).registerReceiver(this.dismissReceiver, intentFilter);
            return;
        }
        throw new RuntimeException("PanelWindow createContainer is null");
    }

    public static /* synthetic */ Object ipc$super(PanelWindow panelWindow, String str, Object... objArr) {
        if (str.hashCode() == -1373052399) {
            super.dismiss();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/share/ui/engine/render/PanelWindow");
    }

    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        oj8.d().e(null);
        bwr.h().t(false);
        LocalBroadcastManager.getInstance(ShareBizAdapter.getInstance().getAppEnv().getApplication()).unregisterReceiver(this.dismissReceiver);
        try {
            super.dismiss();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public FrameLayout createContainer(Activity activity) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("e98a02db", new Object[]{this, activity});
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        if (!isMaskTransparent()) {
            i = Color.parseColor("#7F000000");
        }
        frameLayout.setBackgroundColor(i);
        frameLayout.setOnClickListener(new a());
        return frameLayout;
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        oj8.d().e(null);
        bwr.h().t(false);
        LocalBroadcastManager.getInstance(ShareBizAdapter.getInstance().getAppEnv().getApplication()).unregisterReceiver(this.dismissReceiver);
        LocalBroadcastManager.getInstance(ShareBizAdapter.getInstance().getAppEnv().getApplication()).sendBroadcast(new Intent("action.share_dialog_close"));
        try {
            super.dismiss();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void show(Activity activity) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7429b556", new Object[]{this, activity});
        } else if (activity != null) {
            setFocusable(false);
            update();
            try {
                if (activity instanceof IShareContainer) {
                    view = ((IShareContainer) activity).getShareContainer();
                } else {
                    view = null;
                }
                if (view == null) {
                    view = activity.getWindow().getDecorView();
                }
                showAtLocation(view, 0, 0, 0);
            } catch (WindowManager.BadTokenException unused) {
            }
            setFocusable(true);
            update();
        }
    }

    private boolean isMaskTransparent() {
        TBShareContent e;
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a70e2ac7", new Object[]{this})).booleanValue();
        }
        if ("true".equals(OrangeConfig.getInstance().getConfig("mpm_data_switch", "disableShareTransparent", "false")) || (e = bwr.h().e()) == null || (map = e.templateParams) == null) {
            return false;
        }
        return "true".equals(map.get("maskTransparent"));
    }
}
