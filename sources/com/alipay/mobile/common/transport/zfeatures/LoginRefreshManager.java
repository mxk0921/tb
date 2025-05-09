package com.alipay.mobile.common.transport.zfeatures;

import android.content.Context;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoUtil;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.http.HttpWorker;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class LoginRefreshManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static LoginRefreshManager h;
    public final ReentrantReadWriteLock.ReadLock e;
    public final ReentrantReadWriteLock.WriteLock f;

    /* renamed from: a  reason: collision with root package name */
    public byte f4159a = -1;
    public int b = -1;
    public int c = 0;
    public final Map<HttpWorker, SeqModel> d = new HashMap();
    public final AtomicBoolean g = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class SafetyInspector implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private LoginRefreshManager f4160a;

        public SafetyInspector(LoginRefreshManager loginRefreshManager) {
            this.f4160a = loginRefreshManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (LoginRefreshManager.access$000(this.f4160a).isEmpty()) {
                    LoginRefreshManager.access$100(this.f4160a).set(false);
                    return;
                }
                LoginRefreshManager.access$200(this.f4160a);
                if (LoginRefreshManager.access$000(this.f4160a).isEmpty()) {
                    LoginRefreshManager.access$100(this.f4160a).set(false);
                    LoginRefreshManager.access$300(this.f4160a);
                    return;
                }
                LoginRefreshManager.access$400(this.f4160a);
            } catch (Throwable th) {
                LogCatUtil.warn("LoginRefreshManager", "SafetyInspector. execute error. ", th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class SeqModel {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final long createTime = System.currentTimeMillis();
        public final int seqNum;

        public SeqModel(int i) {
            this.seqNum = i;
        }

        public long getCreateTime() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a9b0beda", new Object[]{this})).longValue();
            }
            return this.createTime;
        }
    }

    public LoginRefreshManager() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.e = reentrantReadWriteLock.readLock();
        this.f = reentrantReadWriteLock.writeLock();
    }

    public static /* synthetic */ Map access$000(LoginRefreshManager loginRefreshManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("74274d4c", new Object[]{loginRefreshManager});
        }
        return loginRefreshManager.d;
    }

    public static /* synthetic */ AtomicBoolean access$100(LoginRefreshManager loginRefreshManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("54804d98", new Object[]{loginRefreshManager});
        }
        return loginRefreshManager.g;
    }

    public static /* synthetic */ void access$200(LoginRefreshManager loginRefreshManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd0e2d59", new Object[]{loginRefreshManager});
        } else {
            loginRefreshManager.i();
        }
    }

    public static /* synthetic */ void access$300(LoginRefreshManager loginRefreshManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c41a145a", new Object[]{loginRefreshManager});
        } else {
            loginRefreshManager.c();
        }
    }

    public static /* synthetic */ void access$400(LoginRefreshManager loginRefreshManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b25fb5b", new Object[]{loginRefreshManager});
        } else {
            loginRefreshManager.g();
        }
    }

    public static final LoginRefreshManager getInstance() {
        LoginRefreshManager loginRefreshManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginRefreshManager) ipChange.ipc$dispatch("34944124", new Object[0]);
        }
        LoginRefreshManager loginRefreshManager2 = h;
        if (loginRefreshManager2 != null) {
            return loginRefreshManager2;
        }
        synchronized (LoginRefreshManager.class) {
            try {
                if (h == null) {
                    h = new LoginRefreshManager();
                }
                loginRefreshManager = h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return loginRefreshManager;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f.lock();
        try {
            a();
        } finally {
            this.f.unlock();
        }
    }

    public boolean checkIn(HttpWorker httpWorker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c8aab6e", new Object[]{this, httpWorker})).booleanValue();
        }
        if (!f()) {
            return true;
        }
        this.e.lock();
        try {
            return b(httpWorker);
        } catch (Throwable th) {
            try {
                LogCatUtil.error("LoginRefreshManager", "checkIn error. ", th);
                return true;
            } finally {
                this.e.unlock();
            }
        }
    }

    public void cleanMapAndReset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a27b8032", new Object[]{this});
            return;
        }
        this.f.lock();
        try {
            if (!((HashMap) this.d).isEmpty()) {
                ((HashMap) this.d).clear();
            }
            a();
            this.f.unlock();
        } catch (Throwable th) {
            this.f.unlock();
            throw th;
        }
    }

    public final void d(HttpWorker httpWorker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20449c7f", new Object[]{this, httpWorker});
        } else if (!httpWorker.getOriginRequest().isSwitchLoginRpc()) {
            ((HashMap) this.d).put(httpWorker, new SeqModel(h()));
            g();
        }
    }

    public final void e(HttpWorker httpWorker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45d8a580", new Object[]{this, httpWorker});
            return;
        }
        ((HashMap) this.d).remove(httpWorker);
        a();
    }

    public void enableRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbc0345f", new Object[]{this});
        } else if (this.f4159a != 1) {
            this.f4159a = (byte) 1;
            LogCatUtil.info("LoginRefreshManager", "enableRefresh. mEnabledLoginRefresh is 1");
        }
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        byte b = this.f4159a;
        if (b == -1 || b != 1) {
            return false;
        }
        return true;
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!this.g.get() && !this.g.get()) {
            this.g.set(true);
            NetworkAsyncTaskExecutor.schedule(new SafetyInspector(this), 60L, TimeUnit.SECONDS);
        }
    }

    public final int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue();
        }
        int i = this.c + 1;
        this.c = i;
        return i;
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.f.lock();
        try {
            if (((HashMap) this.d).isEmpty()) {
                this.f.unlock();
                return;
            }
            ArrayList arrayList = new ArrayList(3);
            for (Map.Entry entry : ((HashMap) this.d).entrySet()) {
                if (System.currentTimeMillis() - ((SeqModel) entry.getValue()).getCreateTime() > 300000) {
                    arrayList.add(entry.getKey());
                }
            }
            if (arrayList.isEmpty()) {
                this.f.unlock();
                return;
            }
            StringBuilder sb = new StringBuilder("gcReqSeqMap.  The GC RPC are: ");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                HttpWorker httpWorker = (HttpWorker) it.next();
                sb.append(httpWorker.getOperationType());
                sb.append(",");
                ((HashMap) this.d).remove(httpWorker);
            }
            this.f.unlock();
            LogCatUtil.warn("LoginRefreshManager", sb.toString());
        } catch (Throwable th) {
            this.f.unlock();
            throw th;
        }
    }

    public void recordRpc(HttpWorker httpWorker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc7c5f1", new Object[]{this, httpWorker});
        } else if (f()) {
            this.f.lock();
            try {
                d(httpWorker);
            } finally {
                this.f.unlock();
            }
        }
    }

    public void removeRecord(HttpWorker httpWorker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c9da512", new Object[]{this, httpWorker});
        } else if (f()) {
            this.f.lock();
            try {
                e(httpWorker);
            } finally {
                this.f.unlock();
            }
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (((HashMap) this.d).isEmpty()) {
            if (this.b != -1 || this.c != 0) {
                this.b = -1;
                this.c = 0;
                LogCatUtil.info("LoginRefreshManager", "reseted");
            }
        }
    }

    public final boolean b(HttpWorker httpWorker) {
        SeqModel seqModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fab09382", new Object[]{this, httpWorker})).booleanValue();
        }
        if (httpWorker.getOriginRequest().isSwitchLoginRpc()) {
            this.b = h();
            LogCatUtil.info("LoginRefreshManager", "loginRespSeq is " + String.valueOf(this.b));
            return true;
        } else if (this.b == -1 || (seqModel = (SeqModel) ((HashMap) this.d).get(httpWorker)) == null || seqModel.seqNum > this.b) {
            return true;
        } else {
            LogCatUtil.warn("LoginRefreshManager", " checkIn it's false. API is " + httpWorker.getOperationType() + ", loginRespSeq=" + this.b + ", rpcReqSeq=" + seqModel.seqNum);
            return false;
        }
    }

    public boolean isEnabledLoginRefresh(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba46063c", new Object[]{this, context})).booleanValue();
        }
        if (!MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.LOGIN_REFRESH_SWITCH))) {
            return false;
        }
        byte b = this.f4159a;
        if (b != -1) {
            return b == 1;
        }
        boolean booleanFromMetaData = MiscUtils.getBooleanFromMetaData(context, "login_refresh_feature");
        LogCatUtil.info("LoginRefreshManager", "isEnabledLoginRefresh. meta-data value : " + booleanFromMetaData);
        try {
            this.f4159a = booleanFromMetaData ? (byte) 1 : (byte) 0;
            LogCatUtil.info("LoginRefreshManager", "isEnabledLoginRefresh. mEnabledLoginRefresh : " + ((int) this.f4159a));
            return booleanFromMetaData;
        } catch (Throwable th) {
            LogCatUtil.error("LoginRefreshManager", "isEnabledLoginRefresh error", th);
            return this.f4159a == 1;
        }
    }
}
