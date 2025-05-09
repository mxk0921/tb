package com.taobao.android.dinamicx.expression.event;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.uof;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DXScrollEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private uof containerSize;
    private uof contentSize;
    private int offsetX;
    private int offsetY;
    private RecyclerView recyclerView;

    static {
        t2o.a(444596814);
    }

    public DXScrollEvent(long j) {
        super(j);
    }

    public static /* synthetic */ Object ipc$super(DXScrollEvent dXScrollEvent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/event/DXScrollEvent");
    }

    public uof getContentSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uof) ipChange.ipc$dispatch("130d7db3", new Object[]{this});
        }
        return this.contentSize;
    }

    public int getOffsetX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25635ee9", new Object[]{this})).intValue();
        }
        return this.offsetX;
    }

    public int getOffsetY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2571766a", new Object[]{this})).intValue();
        }
        return this.offsetY;
    }

    public RecyclerView getRecyclerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("23bc5268", new Object[]{this});
        }
        return this.recyclerView;
    }

    public uof getScrollerSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uof) ipChange.ipc$dispatch("bad2966", new Object[]{this});
        }
        return this.containerSize;
    }

    public void setContentSize(uof uofVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe385107", new Object[]{this, uofVar});
        } else {
            this.contentSize = uofVar;
        }
    }

    public void setOffsetX(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd51edd9", new Object[]{this, new Integer(i)});
        } else {
            this.offsetX = i;
        }
    }

    public void setOffsetY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf06c678", new Object[]{this, new Integer(i)});
        } else {
            this.offsetY = i;
        }
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46db97ca", new Object[]{this, recyclerView});
        } else {
            this.recyclerView = recyclerView;
        }
    }

    public void setScrollerSize(uof uofVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdf2a54c", new Object[]{this, uofVar});
        } else {
            this.containerSize = uofVar;
        }
    }
}
