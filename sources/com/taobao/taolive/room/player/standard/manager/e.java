package com.taobao.taolive.room.player.standard.manager;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.player.standard.manager.a;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class e extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean c;

    static {
        t2o.a(779093184);
    }

    public e(a.h hVar) {
        super(hVar);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        if (str.hashCode() == -1721974827) {
            super.H();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/player/standard/manager/VodBaseMediaManager");
    }

    @Override // com.taobao.taolive.room.player.standard.manager.a, com.taobao.taolive.room.service.IPlayPublicService
    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("995cbfd5", new Object[]{this});
        } else {
            super.H();
        }
    }

    public void T1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3abe1d32", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    @Override // com.taobao.taolive.room.player.standard.manager.a
    public void c1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("231590b3", new Object[]{this});
        } else {
            this.b.R0();
        }
    }

    @Override // com.taobao.taolive.room.player.standard.manager.a
    public void m1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d77d7fdc", new Object[]{this});
        } else {
            this.b.a1();
        }
    }
}
