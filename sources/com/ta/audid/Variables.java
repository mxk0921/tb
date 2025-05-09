package com.ta.audid;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.audid.utils.UtdidLogger;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Variables {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Variables mInstance = new Variables();
    private Context mContext = null;
    private volatile boolean bInit = false;
    private long mDeltaTime = 0;

    static {
        t2o.a(966787074);
    }

    private Variables() {
    }

    public static Variables getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Variables) ipChange.ipc$dispatch("63365254", new Object[0]);
        }
        return mInstance;
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.mContext;
    }

    public long getCurrentTimeMillis() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7aff3291", new Object[]{this})).longValue();
        }
        return System.currentTimeMillis() + this.mDeltaTime;
    }

    public String getCurrentTimeMillisString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6485f492", new Object[]{this});
        }
        return "" + getCurrentTimeMillis();
    }

    public synchronized void initContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6da3ab02", new Object[]{this, context});
            return;
        }
        if (this.mContext == null) {
            if (context != null) {
                if (context.getApplicationContext() != null) {
                    this.mContext = context.getApplicationContext();
                } else {
                    this.mContext = context;
                }
            }
        }
    }

    public void setDebug(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abe02abc", new Object[]{this, new Boolean(z)});
        } else {
            UtdidLogger.setDebug(z);
        }
    }

    public void setSystemTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1444063f", new Object[]{this, new Long(j)});
        } else {
            this.mDeltaTime = j - System.currentTimeMillis();
        }
    }

    public synchronized void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        if (!this.bInit) {
            this.bInit = true;
        }
    }
}
