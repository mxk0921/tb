package anet.channel.session.dns;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import anet.channel.session.dns.NavigationHelper;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.activity.LoadingChatActivity;
import com.taobao.message.util.MessageNavProcessorV2;
import com.taobao.tao.navigation.a;
import com.taobao.umipublish.extension.windvane.UmiWvPlugin;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.hvd;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class DynamicComponentHandler implements hvd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "RemoteFeatureQoS";
    private static DynamicComponentHandler instance = new DynamicComponentHandler();
    private NavigationHelper.IBlockingResourceListener blockingResourceListener = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface ResourceScene {
        public static final int MESSAGE = 1;
        public static final int TAOPAI = 3;
        public static final int TRIVER = 2;
        public static final int UNKNWON = 0;

        /* compiled from: Taobao */
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public @interface Definition {
        }
    }

    static {
        t2o.a(607125733);
    }

    private static boolean isTaopaiURL(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22075724", new Object[]{str})).booleanValue();
        }
        if (str.startsWith(UmiWvPlugin.NEW_RECORD_PATH) || str.startsWith("https://h5.m.taobao.com/litecreator/flat_record.html") || str.startsWith("https://h5.m.taobao.com/taopai/") || str.startsWith("https://h5.m.taobao.com/guangguang/index.htm")) {
            return true;
        }
        return false;
    }

    public static void registerBlockingResourceListener(NavigationHelper.IBlockingResourceListener iBlockingResourceListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6aab5c4", new Object[]{iBlockingResourceListener});
        } else {
            instance.blockingResourceListener = iBlockingResourceListener;
        }
    }

    public static void setupHomeTableMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("331b8d4f", new Object[0]);
        } else {
            a.h(instance);
        }
    }

    @Override // tb.hvd
    public void onTabChanged(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f35fc8", new Object[]{this, new Integer(i), str});
            return;
        }
        ALog.e(TAG, "onTabChanged: index=" + i + ", tabName=" + str, null, new Object[0]);
    }

    private static boolean isMessageURL(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("306d3dc7", new Object[]{str})).booleanValue();
        }
        return str.equals(MessageNavProcessorV2.ROUTE_URL_MESSAGETAB) || str.startsWith(LoadingChatActivity.LOAD_CHAT_URL) || (str.startsWith("http://tb.cn/") && str.contains("nav_source_id=agoo:"));
    }

    private static boolean isTRiverURL(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bad84922", new Object[]{str})).booleanValue();
        }
        return str.startsWith("tbopen://m.taobao.com/tbopen/index.html?h5Url=https%3A%2F%2Fm.duanqu.com%2F%3F_ariver_appid%3D") || (str.startsWith("https://m.duanqu.com") && str.contains("_ariver_appid="));
    }

    public static void onNavigation(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce00a617", new Object[]{intent});
            return;
        }
        Uri data = intent.getData();
        String action = intent.getAction();
        ALog.e(TAG, "onNavigation: uri=" + data + ", action=" + action, null, new Object[0]);
        if (data != null) {
            String uri = data.toString();
            if (!TextUtils.isEmpty(uri) && instance.blockingResourceListener != null) {
                if (isMessageURL(uri)) {
                    ALog.e(TAG, "onNavigation: scene=MESSAGE", null, new Object[0]);
                    instance.blockingResourceListener.onBlockingScene(1);
                } else if (isTRiverURL(uri)) {
                    ALog.e(TAG, "onNavigation: scene=TRIVER", null, new Object[0]);
                    instance.blockingResourceListener.onBlockingScene(2);
                } else if (isTaopaiURL(uri)) {
                    ALog.e(TAG, "onNavigation: scene=TAOPAI", null, new Object[0]);
                    instance.blockingResourceListener.onBlockingScene(3);
                } else {
                    ALog.e(TAG, "onNavigation: scene=UNKNWON", null, new Object[0]);
                    instance.blockingResourceListener.onBlockingScene(0);
                }
            }
        }
    }
}
