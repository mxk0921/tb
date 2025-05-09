package com.taobao.android.dinamicx.expression.event;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXRichTextPressEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String data;

    static {
        t2o.a(444596813);
    }

    public DXRichTextPressEvent(long j) {
        super(j);
    }

    public static /* synthetic */ Object ipc$super(DXRichTextPressEvent dXRichTextPressEvent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/event/DXRichTextPressEvent");
    }

    public String getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f6b2ad9", new Object[]{this});
        }
        return this.data;
    }

    public void setData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("427970bd", new Object[]{this, str});
        } else {
            this.data = str;
        }
    }
}
