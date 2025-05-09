package com.taobao.dai.adapter;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mnncv.MNNCV;
import com.taobao.dai.realtimedebug.WVRealtimeDebugPlugin;
import com.taobao.mrt.MRT;
import com.tmall.android.dai.DAI;
import com.tmall.android.dai.DAIConfiguration;
import java.lang.reflect.Method;
import tb.arh;
import tb.cqh;
import tb.fqh;
import tb.fsw;
import tb.kgh;
import tb.kqh;
import tb.tqh;
import tb.zqh;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MRTTaobaoAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MRTTaobaoAdapter";
    public static boolean mBizSDKInit;
    public static Context mContext;
    public static String mTtid;
    public static boolean mWalleInited;

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements cqh.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f10317a;

        public a(Object obj) {
            this.f10317a = obj;
        }

        @Override // tb.cqh.b
        public void a(cqh cqhVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ceb882b6", new Object[]{this, cqhVar});
            } else if (cqhVar != null) {
                if (!cqhVar.f17231a) {
                    kgh.s(MRTTaobaoAdapter.TAG, "MRT disabled by orange config: isEnable=false");
                    return;
                }
                synchronized (MRTTaobaoAdapter.class) {
                    try {
                        if (!MRTTaobaoAdapter.mWalleInited) {
                            MRTTaobaoAdapter.mWalleInited = MRTTaobaoAdapter.access$000(MRTTaobaoAdapter.mContext, this.f10317a);
                        }
                        if (!MRTTaobaoAdapter.mBizSDKInit) {
                            MRTTaobaoAdapter.mBizSDKInit = true;
                            MRTTaobaoAdapter.access$100(MRTTaobaoAdapter.mContext);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public static /* synthetic */ boolean access$000(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4d2add1", new Object[]{context, obj})).booleanValue();
        }
        return startDAI(context, obj);
    }

    public static /* synthetic */ void access$100(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18144810", new Object[]{context});
        } else {
            startMNNCV(context);
        }
    }

    private static void registerService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49ddee19", new Object[0]);
            return;
        }
        if (zqh.d().b() == null) {
            zqh.d().h(new arh());
        }
        if (zqh.d().c() == null) {
            zqh.d().i(new kqh());
        }
        if (zqh.d().a() == null) {
            zqh.d().g(new fqh());
        }
    }

    private static boolean startDAI(Context context, Object obj) {
        if (context == null || obj == null) {
            return false;
        }
        try {
            IpChange ipChange = DAI.$ipChange;
            IpChange ipChange2 = DAIConfiguration.$ipChange;
            Method declaredMethod = DAI.class.getDeclaredMethod("initialize", Context.class, DAIConfiguration.class);
            if (declaredMethod != null) {
                declaredMethod.invoke(null, context, obj);
            }
        } catch (Throwable unused) {
            kgh.s(TAG, "init DAI failed");
        }
        return true;
    }

    private static void startMNNCV(Context context) {
        try {
            IpChange ipChange = MNNCV.$ipChange;
            Method declaredMethod = MNNCV.class.getDeclaredMethod("init", Context.class);
            if (declaredMethod != null) {
                declaredMethod.invoke(null, context);
            }
        } catch (Throwable unused) {
            kgh.s(TAG, "init MNNCV failed");
        }
    }

    public static void startMNNRuntime(Context context, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39cfab3a", new Object[]{context, str, obj});
            return;
        }
        kgh.s(TAG, "[startMNNRuntime]");
        mContext = context;
        mTtid = str;
        registerService();
        MRT.f11137a = str;
        cqh.d(new a(obj));
        MRT.h(mContext);
        fsw.h(tqh.REALTIME_DEBUG, WVRealtimeDebugPlugin.class);
        tqh.a();
        setupMNNWB(context);
    }

    private static void setupMNNWB(Context context) {
        try {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                try {
                    Class<?> cls = Class.forName("com.taobao.android.mnndebug.workbench.MNNWB");
                    cls.getDeclaredMethod("registerDebugWVPlugin", new Class[0]).invoke(cls, new Object[0]);
                    cls.getDeclaredMethod("setup", Context.class).invoke(cls, context);
                    cls.getDeclaredMethod("tryToReconnect", new Class[0]).invoke(cls, new Object[0]);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
