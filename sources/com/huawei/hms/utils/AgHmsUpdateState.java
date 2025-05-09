package com.huawei.hms.utils;

import com.huawei.hms.common.HmsCheckedState;
import com.huawei.hms.support.log.HMSLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AgHmsUpdateState {
    private static final Object c = new Object();
    private static volatile AgHmsUpdateState d;

    /* renamed from: a  reason: collision with root package name */
    private HmsCheckedState f5502a = HmsCheckedState.UNCHECKED;
    private int b = 0;

    private AgHmsUpdateState() {
    }

    public static AgHmsUpdateState getInstance() {
        if (d == null) {
            synchronized (c) {
                try {
                    if (d == null) {
                        d = new AgHmsUpdateState();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public HmsCheckedState getCheckedState() {
        return this.f5502a;
    }

    public int getTargetVersionCode() {
        return this.b;
    }

    public boolean isUpdateHms() {
        if (getCheckedState() != HmsCheckedState.NEED_UPDATE || this.b == 0) {
            return false;
        }
        return true;
    }

    public void resetUpdateState() {
        if (getCheckedState() == HmsCheckedState.NEED_UPDATE) {
            setCheckedState(HmsCheckedState.NOT_NEED_UPDATE);
            setTargetVersionCode(0);
        }
    }

    public void setTargetVersionCode(int i) {
        this.b = i;
    }

    public void setCheckedState(HmsCheckedState hmsCheckedState) {
        if (hmsCheckedState == null) {
            HMSLog.e("AgHmsUpdateState", "para invalid: checkedState is null");
        } else {
            this.f5502a = hmsCheckedState;
        }
    }
}
