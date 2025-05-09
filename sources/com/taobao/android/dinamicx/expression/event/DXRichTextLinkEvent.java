package com.taobao.android.dinamicx.expression.event;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXRichTextLinkEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String link;

    static {
        t2o.a(444596812);
    }

    public DXRichTextLinkEvent(long j) {
        super(j);
    }

    public static /* synthetic */ Object ipc$super(DXRichTextLinkEvent dXRichTextLinkEvent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/event/DXRichTextLinkEvent");
    }

    public String getLink() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c509bc89", new Object[]{this});
        }
        return this.link;
    }

    public void setLink(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70ad150d", new Object[]{this, str});
        } else {
            this.link = str;
        }
    }
}
