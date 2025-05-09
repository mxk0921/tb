package com.taobao.message.lab.comfrm.support.list;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.render.WidgetInstance;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class BaseAbsListWidgetInstance<T extends Serializable> extends WidgetInstance<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(537919820);
    }

    public static /* synthetic */ Object ipc$super(BaseAbsListWidgetInstance baseAbsListWidgetInstance, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/support/list/BaseAbsListWidgetInstance");
    }

    public abstract WidgetInstance getHeader();
}
