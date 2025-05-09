package com.taobao.android.dinamicx.expression.event;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.mw5;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DXPageChangeEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean isTouched;
    public int pageIndex;

    static {
        t2o.a(444596808);
    }

    public DXPageChangeEvent(long j) {
        super(j);
    }

    public static /* synthetic */ Object ipc$super(DXPageChangeEvent dXPageChangeEvent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/event/DXPageChangeEvent");
    }

    public void setPageIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e74d6bb", new Object[]{this, new Integer(i)});
        } else {
            setPageIndex(i, false);
        }
    }

    public void setPageIndex(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7026b379", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        this.pageIndex = i;
        this.isTouched = z;
        if (this.args == null) {
            this.args = new HashMap();
        }
        this.args.put("pageIndex", mw5.K(i));
        this.args.put("isTouched", mw5.G(z));
        this.args.put("fromAutoScroll", mw5.G(!z));
    }
}
