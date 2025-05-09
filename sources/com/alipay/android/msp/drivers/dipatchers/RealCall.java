package com.alipay.android.msp.drivers.dipatchers;

import com.alipay.android.msp.core.clients.MspLogicClient;
import com.alipay.android.msp.drivers.actions.Action;
import com.alipay.android.msp.drivers.dipatchers.MspResponse;
import com.alipay.android.msp.utils.ExceptionUtils;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import tb.xpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RealCall implements Call {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MspLogicClient f3568a;
    public final Action b;
    public boolean c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class AsyncCall implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Callback f3569a;

        public AsyncCall(Callback callback) {
            this.f3569a = callback;
        }

        public final void execute() {
            Exception e;
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
                return;
            }
            try {
            } catch (Exception e2) {
                e = e2;
                z = false;
            }
            try {
                this.f3569a.onResponse(RealCall.this, RealCall.this.getResponse());
                if (RealCall.access$100(RealCall.this).dispatcher() != null) {
                    RealCall.access$100(RealCall.this).dispatcher().finished(this);
                }
            } catch (Exception e3) {
                e = e3;
                LogUtil.printExceptionStackTrace("AsyncCall", xpc.RECORD_EXECUTE, e);
                if (!z) {
                    this.f3569a.onFailure(RealCall.this, e);
                }
                if (RealCall.access$100(RealCall.this).dispatcher() != null) {
                    RealCall.access$100(RealCall.this).dispatcher().finished(this);
                }
                ExceptionUtils.sendUiMsgWhenException(RealCall.access$100(RealCall.this).getMspContext().getBizId(), e);
            }
        }

        public final RealCall get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RealCall) ipChange.ipc$dispatch("dcc71340", new Object[]{this});
            }
            return RealCall.this;
        }

        public final Action getAction() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Action) ipChange.ipc$dispatch("1971399c", new Object[]{this});
            }
            return RealCall.access$000(RealCall.this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                execute();
            }
        }
    }

    public RealCall(MspLogicClient mspLogicClient, Action action) {
        this.f3568a = mspLogicClient;
        this.b = action;
    }

    public static /* synthetic */ Action access$000(RealCall realCall) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Action) ipChange.ipc$dispatch("18eb1287", new Object[]{realCall});
        }
        return realCall.b;
    }

    public static /* synthetic */ MspLogicClient access$100(RealCall realCall) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspLogicClient) ipChange.ipc$dispatch("a9728f8c", new Object[]{realCall});
        }
        return realCall.f3568a;
    }

    public static RealCall newRealCall(MspLogicClient mspLogicClient, Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RealCall) ipChange.ipc$dispatch("541874bc", new Object[]{mspLogicClient, action});
        }
        return new RealCall(mspLogicClient, action);
    }

    @Override // com.alipay.android.msp.drivers.dipatchers.Call
    public void enqueue(Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed56732d", new Object[]{this, callback});
            return;
        }
        synchronized (this) {
            if (!this.c) {
                this.c = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        MspLogicClient mspLogicClient = this.f3568a;
        if (mspLogicClient != null) {
            synchronized (mspLogicClient.getUiLock()) {
                try {
                    if (this.f3568a.dispatcher() == null || this.f3568a.dispatcher().isHasShutDown()) {
                        LogUtil.e("RealCall", "enqueue", "executorService shutdown, client =" + this.f3568a + ", context=" + this.f3568a.getMspContext());
                    } else {
                        this.f3568a.dispatcher().enqueue(new AsyncCall(callback));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        LogUtil.e("RealCall", "enqueue", "client is null");
    }

    @Override // com.alipay.android.msp.drivers.dipatchers.Call
    public MspResponse execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspResponse) ipChange.ipc$dispatch("d4f4f2ce", new Object[]{this});
        }
        synchronized (this) {
            if (!this.c) {
                this.c = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        try {
            return getResponse();
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace("RealCall", xpc.RECORD_EXECUTE, e);
            ExceptionUtils.sendUiMsgWhenException(this.f3568a.getMspContext().getBizId(), e);
            return null;
        }
    }

    @Override // com.alipay.android.msp.drivers.dipatchers.Call
    public Action getAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Action) ipChange.ipc$dispatch("1971399c", new Object[]{this});
        }
        return this.b;
    }

    public MspResponse getResponse() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspResponse) ipChange.ipc$dispatch("e079690", new Object[]{this});
        }
        return new MspResponse.Builder().request(this.b).body(this.f3568a.processAction(this.b)).build();
    }
}
