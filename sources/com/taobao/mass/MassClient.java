package com.taobao.mass;

import android.content.ComponentName;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.AccsIPCProvider;
import com.taobao.accs.utl.ALog;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.intf.ProcessStateListener;
import java.util.Collections;
import java.util.List;
import tb.j8l;
import tb.re;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MassClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile MassClient instance;
    private Handler handler;
    private IMassService iMassService;
    private static final String TAG = MassClient.class.getSimpleName();
    public static volatile boolean topicRegistered = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements ProcessStateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentName f11012a;

        public a(ComponentName componentName) {
            this.f11012a = componentName;
        }

        @Override // com.taobao.aranger.intf.ProcessStateListener
        public void onProcessStart(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("107b37c3", new Object[]{this, str});
            }
        }

        @Override // com.taobao.aranger.intf.ProcessStateListener
        public void onProcessStop(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72a7dcc3", new Object[]{this, str});
                return;
            }
            try {
                MassClient.access$002(MassClient.this, (IMassService) re.q(this.f11012a, IMassService.class, new Pair[0]));
            } catch (IPCException e) {
                ALog.e(MassClient.access$100(), "[getMassService]", null, e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11013a;
        public final /* synthetic */ String b;

        public b(String str, String str2) {
            this.f11013a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                MassClient.access$200(MassClient.this).registerTopic(this.f11013a, this.b);
            } catch (Exception e) {
                ALog.e(MassClient.access$100(), "registerTopic error", e, new Object[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11014a;
        public final /* synthetic */ String b;

        public c(String str, String str2) {
            this.f11014a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                MassClient.access$200(MassClient.this).unregisterTopic(this.f11014a, this.b);
            } catch (Exception e) {
                ALog.e(MassClient.access$100(), "unregisterTopic error", e, new Object[0]);
            }
        }
    }

    static {
        t2o.a(343933309);
    }

    private MassClient() {
        HandlerThread handlerThread = new HandlerThread(TAG);
        handlerThread.start();
        this.handler = new Handler(handlerThread.getLooper());
    }

    public static /* synthetic */ IMassService access$002(MassClient massClient, IMassService iMassService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMassService) ipChange.ipc$dispatch("df0e84f5", new Object[]{massClient, iMassService});
        }
        massClient.iMassService = iMassService;
        return iMassService;
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return TAG;
    }

    public static /* synthetic */ IMassService access$200(MassClient massClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMassService) ipChange.ipc$dispatch("8df9d544", new Object[]{massClient});
        }
        return massClient.getMassService();
    }

    public static MassClient getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MassClient) ipChange.ipc$dispatch("b26aa7ac", new Object[0]);
        }
        if (instance == null) {
            synchronized (MassClient.class) {
                try {
                    if (instance == null) {
                        instance = new MassClient();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    private IMassService getMassService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMassService) ipChange.ipc$dispatch("72e69fd3", new Object[]{this});
        }
        if (!j8l.B()) {
            return null;
        }
        if (this.iMassService == null) {
            ComponentName componentName = new ComponentName(re.r(), AccsIPCProvider.class);
            try {
                this.iMassService = (IMassService) re.q(componentName, IMassService.class, new Pair[0]);
            } catch (IPCException e) {
                ALog.e(TAG, "[getMassService]", null, e);
            }
            re.C(new a(componentName));
        }
        return this.iMassService;
    }

    public List<String> getTopicsByService(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b740deb2", new Object[]{this, str});
        }
        try {
            if (j8l.u()) {
                return getMassService().getTopicsByService(str);
            }
            return Collections.emptyList();
        } catch (Exception e) {
            ALog.e(TAG, "getTopicsByService error", e, new Object[0]);
            return Collections.emptyList();
        }
    }

    public void unregisterTopic(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d56dc16e", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str2)) {
            ALog.e(TAG, "unregisterTopic error, topic is null", new Object[0]);
        } else if (j8l.u()) {
            this.handler.post(new c(str, str2));
        }
    }

    public boolean isNotEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8421800f", new Object[]{this})).booleanValue();
        }
        return topicRegistered && !getInstance().getTopicsByService("powermsg").isEmpty();
    }

    public void registerTopic(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba126267", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str2)) {
            ALog.e(TAG, "registerTopic error, topic is null", new Object[0]);
        } else if (j8l.u()) {
            topicRegistered = true;
            this.handler.post(new b(str, str2));
        }
    }
}
