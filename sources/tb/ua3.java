package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Process;
import android.view.View;
import com.alibaba.android.icart.core.event.ItemOperationSubscriber;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXButterRootView;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ua3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ua3 INSTANCE = new ua3();

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Process.killProcess(Process.myPid());
            }
        }
    }

    static {
        t2o.a(479199562);
    }

    @JvmStatic
    public static final void b(ArrayList<ItemOperationSubscriber.ItemOperate> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b482bbfc", new Object[]{arrayList});
        } else if (arrayList != null && n7v.a()) {
            try {
                arrayList.add(new ItemOperationSubscriber.ItemOperate("DEBUG组件信息", "cartDebugClick"));
                arrayList.add(new ItemOperationSubscriber.ItemOperate("清除首页缓存", "cartClearCacheClick"));
                Result.m1108constructorimpl(xhv.INSTANCE);
            } catch (Throwable th) {
                Result.m1108constructorimpl(b.a(th));
            }
        }
    }

    public final void c(Context context, IDMComponent iDMComponent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ed6d179", new Object[]{this, context, iDMComponent, view});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("模板是否开启Butter：", String.valueOf(view instanceof DXButterRootView));
        xhv xhvVar = xhv.INSTANCE;
        l7v.d(context, iDMComponent, hashMap);
    }

    @JvmStatic
    public static final boolean a(Context context, String str, IDMComponent iDMComponent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b583df7b", new Object[]{context, str, iDMComponent, view})).booleanValue();
        }
        ckf.g(str, "eventName");
        if (context != null && n7v.a()) {
            if (ckf.b("cartDebugClick", str)) {
                INSTANCE.c(context, iDMComponent, view);
                return true;
            } else if (ckf.b("cartClearCacheClick", str)) {
                op6.g(context);
                l8v.a("已清除缓存，即将自动结束进程");
                if (context instanceof Activity) {
                    pav.l(a.INSTANCE, 1000L);
                }
                return true;
            }
        }
        return false;
    }
}
