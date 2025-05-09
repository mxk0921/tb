package com.taobao.message.lab.comfrm.inner2;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class DeltaItem {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CUSTOM_INPUT = 102;
    public static final int CUSTOM_RESOURCE = 101;
    public static final int LIST = 1;
    public static final int SIMPLE_MAP = 2;
    public static final int UNKNOW = 0;
    private Object dataChange;
    private int dataType;
    private Object reasons;

    static {
        t2o.a(537919591);
    }

    public DeltaItem(int i, Object obj) {
        this.dataType = i;
        this.dataChange = obj;
    }

    public Object getDataChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8b24e79b", new Object[]{this});
        }
        return this.dataChange;
    }

    public int getDataType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("87ac82f4", new Object[]{this})).intValue();
        }
        return this.dataType;
    }

    public Object getReasons() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("938ed4b2", new Object[]{this});
        }
        return this.reasons;
    }

    public DeltaItem(int i, Object obj, Object obj2) {
        this.dataType = i;
        this.dataChange = obj;
        this.reasons = obj2;
    }
}
