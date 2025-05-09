package com.taobao.weex.dom.binding;

import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WXStatement extends ArrayMap<String, Object> implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String WX_FOR = "[[repeat]]";
    public static final String WX_FOR_INDEX = "@index";
    public static final String WX_FOR_ITEM = "@alias";
    public static final String WX_FOR_LIST = "@expression";
    public static final String WX_IF = "[[match]]";
    public static final String WX_ONCE = "[[once]]";

    static {
        t2o.a(985661603);
    }

    public WXStatement() {
    }

    public static /* synthetic */ Object ipc$super(WXStatement wXStatement, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/dom/binding/WXStatement");
    }

    public WXStatement(SimpleArrayMap simpleArrayMap) {
        super(simpleArrayMap);
    }

    public WXStatement clone() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WXStatement) ipChange.ipc$dispatch("c9ad52b9", new Object[]{this}) : new WXStatement(this);
    }
}
