package com.taobao.phenix.intf.event;

import android.graphics.drawable.BitmapDrawable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.b1m;
import tb.p1m;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SuccPhenixEvent extends b1m {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public BitmapDrawable drawable;
    private boolean fromDisk;
    @Deprecated
    public boolean fromMCache;
    private boolean fromSecondary;
    public boolean immediate;
    private boolean intermediate;
    public boolean needRefresh;

    static {
        t2o.a(620757107);
    }

    public SuccPhenixEvent(p1m p1mVar) {
        super(p1mVar);
    }

    public static /* synthetic */ Object ipc$super(SuccPhenixEvent succPhenixEvent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/phenix/intf/event/SuccPhenixEvent");
    }

    public void fromDisk(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81e6b326", new Object[]{this, new Boolean(z)});
        } else {
            this.fromDisk = z;
        }
    }

    public void fromSecondary(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca1f4883", new Object[]{this, new Boolean(z)});
        } else {
            this.fromSecondary = z;
        }
    }

    public BitmapDrawable getDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("b9e85550", new Object[]{this});
        }
        return this.drawable;
    }

    public boolean isFromDisk() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52ae9fbc", new Object[]{this})).booleanValue();
        }
        return this.fromDisk;
    }

    @Deprecated
    public boolean isFromMCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67415c34", new Object[]{this})).booleanValue();
        }
        return this.fromMCache;
    }

    public boolean isFromSecondary() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("471f646b", new Object[]{this})).booleanValue();
        }
        return this.fromSecondary;
    }

    public boolean isImmediate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bee452b2", new Object[]{this})).booleanValue();
        }
        return this.immediate;
    }

    public boolean isIntermediate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd94de4e", new Object[]{this})).booleanValue();
        }
        return this.intermediate;
    }

    public boolean isNeedRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("134aa8e6", new Object[]{this})).booleanValue();
        }
        return this.needRefresh;
    }

    public void setDrawable(BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19b575dc", new Object[]{this, bitmapDrawable});
        } else {
            this.drawable = bitmapDrawable;
        }
    }

    @Deprecated
    public void setFromMCache(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d5dd66c", new Object[]{this, new Boolean(z)});
        } else {
            this.fromMCache = z;
        }
    }

    public void setImmediate(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d89631e", new Object[]{this, new Boolean(z)});
        } else {
            this.immediate = z;
        }
    }

    public void setIntermediate(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80a34592", new Object[]{this, new Boolean(z)});
        } else {
            this.intermediate = z;
        }
    }

    public void setNeedRefresh(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f7656a", new Object[]{this, new Boolean(z)});
        } else {
            this.needRefresh = z;
        }
    }
}
