package com.alibaba.security.ccrc.manager;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.security.ccrc.service.build.B;
import com.alibaba.security.ccrc.service.build.C1180n;
import com.alibaba.security.ccrc.service.build.N;
import com.alibaba.security.ccrc.service.build.vb;
import com.alibaba.security.client.smart.core.track.TrackManager;
import com.alibaba.security.wukong.AlgoResultReporter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.security.sdk.SecurityGuardManager;
import com.taobao.wireless.security.sdk.staticdatastore.IStaticDataStoreComponent;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.rv7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CcrcContextImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "CcrcContextImpl";
    public String mAppKey;
    public String mAppName;
    public String mAppVersion;
    public Context mContext;
    public final AtomicBoolean mInited;
    public String mTtid;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final CcrcContextImpl f2537a = new CcrcContextImpl();

        public static /* synthetic */ CcrcContextImpl a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CcrcContextImpl) ipChange.ipc$dispatch("2c1cc18d", new Object[0]);
            }
            return f2537a;
        }
    }

    private boolean doInit(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72980dc8", new Object[]{this, context, str, new Boolean(z)})).booleanValue();
        }
        if (!this.mInited.compareAndSet(false, true)) {
            return true;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.mContext = context;
        this.mTtid = str;
        vb.c().a(this.mContext);
        TrackManager.init(this.mContext);
        AlgoResultReporter.a.f2920a.init(this.mContext);
        N.a();
        if (z) {
            rv7.g(this.mContext);
            B.a().a(this.mContext, str);
            B.a().c();
        }
        return true;
    }

    private String getAppKeyFromSecurityGuard(Context context) {
        IStaticDataStoreComponent staticDataStoreComp;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f17d7406", new Object[]{this, context});
        }
        SecurityGuardManager instance = SecurityGuardManager.getInstance(context);
        if (instance == null || (staticDataStoreComp = instance.getStaticDataStoreComp()) == null) {
            return "";
        }
        return staticDataStoreComp.getAppKeyByIndex(0);
    }

    public static Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[0]);
        }
        return a.f2537a.mContext;
    }

    public static CcrcContextImpl getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CcrcContextImpl) ipChange.ipc$dispatch("a76fb7", new Object[0]);
        }
        return a.f2537a;
    }

    public String getAppKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49079005", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.mAppKey)) {
            this.mAppKey = getAppKeyFromSecurityGuard(this.mContext);
        }
        return this.mAppKey;
    }

    public String getAppName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92150ca3", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.mAppName)) {
            this.mAppName = C1180n.b(this.mContext);
        }
        return this.mAppName;
    }

    public String getAppVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.mAppVersion)) {
            this.mAppVersion = C1180n.a(this.mContext);
        }
        return this.mAppVersion;
    }

    public String getTtid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99fd2f88", new Object[]{this});
        }
        return this.mTtid;
    }

    public boolean init(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be7aec9d", new Object[]{this, context, str, new Boolean(z)})).booleanValue();
        }
        try {
            return doInit(context, str, z);
        } catch (Exception unused) {
            return false;
        }
    }

    public void setAppKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77945e11", new Object[]{this, str});
        } else {
            this.mAppKey = str;
        }
    }

    public void setAppName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b790109b", new Object[]{this, str});
        } else {
            this.mAppName = str;
        }
    }

    public void setAppVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cefab34a", new Object[]{this, str});
        } else {
            this.mAppVersion = str;
        }
    }

    public CcrcContextImpl() {
        this.mInited = new AtomicBoolean(false);
    }
}
