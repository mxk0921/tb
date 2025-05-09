package tb;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.poplayer.trigger.page.PageTriggerService;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wlo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793495);
    }

    public static void a(Activity activity, CommonSearchContext commonSearchContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19b815bc", new Object[]{activity, commonSearchContext, str});
        } else if (TextUtils.isEmpty(str)) {
            b4p.a("SearchPoplayerUtil", "SRP不调用poplayer:传给poplayer的url为空");
        } else {
            if (o4p.Q1()) {
                if (str.startsWith("elderSearch")) {
                    str = "elderSearch";
                }
                if (str.startsWith("inSearchElder")) {
                    str = "inSearchElder";
                }
            }
            Intent intent = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
            String str2 = PageTriggerService.PAGE_SCHEME + str;
            String packageName = Globals.getApplication().getPackageName();
            b4p.a("SearchPoplayerUtil", "call poplayer: " + packageName);
            intent.setPackage(packageName);
            intent.putExtra("event", str2);
            LocalBroadcastManager.getInstance(activity).sendBroadcast(intent);
            b4p.a("SearchPoplayerUtil", "SRP调用poplayer成功啦, evenValue是:" + str2);
        }
    }
}
