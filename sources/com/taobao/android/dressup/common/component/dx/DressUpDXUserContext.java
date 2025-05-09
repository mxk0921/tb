package com.taobao.android.dressup.common.component.dx;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import kotlin.Metadata;
import tb.fl6;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/taobao/android/dressup/common/component/dx/DressUpDXUserContext;", "Ltb/fl6;", "Ljava/io/Serializable;", "<init>", "()V", "", "key", "getStringValue", "(Ljava/lang/String;)Ljava/lang/String;", "", "getIntValue", "(Ljava/lang/String;)I", "", "getObject", "(Ljava/lang/String;)Ljava/lang/Object;", "Lcom/alibaba/fastjson/JSONObject;", "mContext", "Lcom/alibaba/fastjson/JSONObject;", "turboflow_dressup_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class DressUpDXUserContext extends fl6 implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final JSONObject mContext = new JSONObject();

    static {
        t2o.a(918552616);
    }

    public static /* synthetic */ Object ipc$super(DressUpDXUserContext dressUpDXUserContext, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/component/dx/DressUpDXUserContext");
    }

    public final int getIntValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8b0a4bc", new Object[]{this, str})).intValue();
        }
        return this.mContext.getIntValue(str);
    }

    public final Object getObject(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c26088ec", new Object[]{this, str});
        }
        return this.mContext.get(str);
    }

    public final String getStringValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f60d845", new Object[]{this, str});
        }
        return this.mContext.getString(str);
    }
}
