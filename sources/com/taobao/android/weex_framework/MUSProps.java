package com.taobao.android.weex_framework;

import android.text.TextUtils;
import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.pg1;
import tb.t2o;
import tb.wwh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class MUSProps implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final SparseArray<MUSValue> mIdProps = new SparseArray<>();
    private final Map<String, MUSValue> mStrProps = new HashMap();
    private final List<wwh> mRawProps = new LinkedList();

    static {
        t2o.a(982516034);
    }

    public List<wwh> getRawProps() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7fca8682", new Object[]{this});
        }
        return this.mRawProps;
    }

    public Map<String, MUSValue> getStringProps() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("50f7c8e5", new Object[]{this});
        }
        return this.mStrProps;
    }

    public void put(String str, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed3ff30d", new Object[]{this, str, mUSValue});
        } else if (!TextUtils.isEmpty(str)) {
            this.mRawProps.add(new wwh(str, mUSValue));
        }
    }

    public void put(int i, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92bca8da", new Object[]{this, new Integer(i), mUSValue});
        } else if (i >= 0) {
            String[] strArr = pg1.ARRAY;
            if (i < strArr.length) {
                this.mRawProps.add(new wwh(strArr[i], mUSValue));
            }
        }
    }
}
