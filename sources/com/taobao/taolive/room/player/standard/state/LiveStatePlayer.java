package com.taobao.taolive.room.player.standard.state;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.security.realidentity.e2;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.s;
import com.taobao.mediaplay.MediaPlayCenter;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.model.PlayerQualityItem;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.MediaData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.List;
import tb.btd;
import tb.cdr;
import tb.ejr;
import tb.h7m;
import tb.isc;
import tb.pvs;
import tb.rjr;
import tb.soq;
import tb.t2o;
import tb.ulq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class LiveStatePlayer extends BaseStatePlayer implements btd.b, isc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String O;
    public final int P;
    public IMediaPlayer.a Q;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public @interface SharePlayerType {
        public static final int TYPE_CAN_NOT_REUSE = 3;
        public static final int TYPE_CAN_REUSE = 0;
        public static final int TYPE_CAN_REUSE_OTHERS = 2;
        public static final int TYPE_REUSE = 1;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$taolive$sdk$ui$media$IMediaPlayer$UpdataUrlListMode;

        static {
            int[] iArr = new int[IMediaPlayer.UpdataUrlListMode.values().length];
            $SwitchMap$com$taobao$taolive$sdk$ui$media$IMediaPlayer$UpdataUrlListMode = iArr;
            try {
                iArr[IMediaPlayer.UpdataUrlListMode.INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$taolive$sdk$ui$media$IMediaPlayer$UpdataUrlListMode[IMediaPlayer.UpdataUrlListMode.REPLACE_BY_URL_ID_OF_NEW_DEFINITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$taolive$sdk$ui$media$IMediaPlayer$UpdataUrlListMode[IMediaPlayer.UpdataUrlListMode.REPLACE_FORCE_OF_NEW_DEFINITION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        t2o.a(779093199);
        t2o.a(806356019);
        t2o.a(774897794);
    }

    public LiveStatePlayer(Context context, int i) {
        super(context);
        this.P = i;
        e2();
    }

    public static /* synthetic */ Object ipc$super(LiveStatePlayer liveStatePlayer, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1362178205) {
            super.N(((Number) objArr[0]).longValue());
            return null;
        } else if (hashCode == -1054322589) {
            super.P0();
            return null;
        } else if (hashCode == 2067023698) {
            super.T0();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolive/room/player/standard/state/LiveStatePlayer");
        }
    }

    @Override // tb.isc
    public void A(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eed540ac", new Object[]{this, hashMap});
            return;
        }
        IMediaPlayer.a aVar = this.Q;
        if (aVar != null) {
            ((soq) aVar).A(hashMap);
        }
    }

    @Override // com.taobao.taolive.room.player.standard.state.BaseStatePlayer
    public void N(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aececf63", new Object[]{this, new Long(j)});
        } else {
            super.N(j);
        }
    }

    @Override // com.taobao.taolive.room.player.standard.state.BaseStatePlayer
    public void P0() {
        btd btdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1285063", new Object[]{this});
            return;
        }
        super.P0();
        if (this.c != null && (btdVar = (btd) rjr.e().d(this.c.p(), btd.class)) != null) {
            btdVar.a(this);
        }
    }

    @Override // com.taobao.taolive.room.player.standard.state.BaseStatePlayer
    public void T0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b344752", new Object[]{this});
            return;
        }
        super.T0();
        this.Q = null;
        this.O = null;
    }

    public final h7m V1(PlayerQualityItem playerQualityItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h7m) ipChange.ipc$dispatch("caa16d0a", new Object[]{this, playerQualityItem});
        }
        if (playerQualityItem == null) {
            return null;
        }
        h7m h7mVar = new h7m();
        h7mVar.e = playerQualityItem.current;
        h7mVar.b = playerQualityItem.newDefinition;
        h7mVar.f20456a = playerQualityItem.newName;
        h7mVar.d = playerQualityItem.definition;
        h7mVar.c = playerQualityItem.name;
        return h7mVar;
    }

    public h7m W1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h7m) ipChange.ipc$dispatch("a656e820", new Object[]{this});
        }
        s sVar = this.e;
        PlayerQualityItem playerQualityItem = null;
        if (sVar == null) {
            return null;
        }
        Object n = sVar.n(4004);
        if (n instanceof PlayerQualityItem) {
            playerQualityItem = (PlayerQualityItem) n;
        }
        h7m V1 = V1(playerQualityItem);
        ulq.d(V1);
        return V1;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<tb.h7m> X1(boolean r5) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.taolive.room.player.standard.state.LiveStatePlayer.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001d
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r5)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r1] = r4
            r5[r0] = r3
            java.lang.String r0 = "c1c16f81"
            java.lang.Object r5 = r2.ipc$dispatch(r0, r5)
            java.util.List r5 = (java.util.List) r5
            return r5
        L_0x001d:
            com.taobao.avplayer.s r2 = r4.e
            r3 = 0
            if (r2 == 0) goto L_0x0038
            if (r5 == 0) goto L_0x002b
            r5 = 4004(0xfa4, float:5.611E-42)
            java.lang.Object r5 = r2.n(r5)
            goto L_0x0031
        L_0x002b:
            r5 = 4012(0xfac, float:5.622E-42)
            java.lang.Object r5 = r2.n(r5)
        L_0x0031:
            boolean r2 = r5 instanceof java.util.List
            if (r2 == 0) goto L_0x0038
            java.util.List r5 = (java.util.List) r5
            goto L_0x0039
        L_0x0038:
            r5 = r3
        L_0x0039:
            if (r5 == 0) goto L_0x0059
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0040:
            int r3 = r5.size()
            if (r1 >= r3) goto L_0x0055
            java.lang.Object r3 = r5.get(r1)
            com.taobao.mediaplay.model.PlayerQualityItem r3 = (com.taobao.mediaplay.model.PlayerQualityItem) r3
            tb.h7m r3 = r4.V1(r3)
            r2.add(r3)
            int r1 = r1 + r0
            goto L_0x0040
        L_0x0055:
            tb.ulq.e(r2)
            return r2
        L_0x0059:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.room.player.standard.state.LiveStatePlayer.X1(boolean):java.util.List");
    }

    public void Z1(IMediaPlayer.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc964e67", new Object[]{this, aVar});
            return;
        }
        this.Q = aVar;
        s sVar = this.e;
        if (sVar != null) {
            sVar.D(e2.z0, this);
        }
    }

    public void a2(boolean z) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7d128a9", new Object[]{this, new Boolean(z)});
            return;
        }
        s sVar = this.e;
        if (sVar != null) {
            if (z) {
                j = 1;
            } else {
                j = 0;
            }
            sVar.C(1022, j);
        }
    }

    public void c2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30089ed7", new Object[]{this, new Boolean(z)});
            return;
        }
        s.d dVar = this.f;
        if (dVar != null) {
            dVar.l(z);
        }
    }

    public void d2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7891058", new Object[]{this, new Boolean(z)});
        } else if (this.f != null) {
            C0("mTBPlayerInfo,setTBPlayerInfoReUse,reUse = " + z);
            this.f.m(z);
        }
    }

    public void e2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10e43958", new Object[]{this});
            return;
        }
        int i = this.P;
        if (i == 0) {
            c2(true);
            d2(false);
        } else if (i == 1) {
            c2(true);
            d2(true);
        } else if (i != 2) {
            c2(false);
            d2(false);
        } else {
            c2(false);
            d2(true);
        }
    }

    public void f2(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5be6cf22", new Object[]{this, new Integer(i), str});
        } else if (this.e != null) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("switchReason", Integer.valueOf(i));
            hashMap.put("switchNewDefinition", str);
            this.e.c("switchToNewDefinition", hashMap);
        }
    }

    public void g2(List<MediaData.QualityLiveItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("420e1f1c", new Object[]{this, list});
        } else if (this.e != null) {
            ulq.f(list);
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("list", ulq.c(list));
            hashMap.put("mode", MediaPlayCenter.UpdataUrlListMode.REPLACE_BY_URL_ID_OF_NEW_DEFINITION);
            this.e.c("updateUrlList", hashMap);
        }
    }

    @Override // com.taobao.taolive.room.player.standard.state.BaseStatePlayer
    public void t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("539f89f7", new Object[]{this});
        } else {
            this.f.n = "TBLive";
        }
    }

    public void Y1(MediaLiveInfo mediaLiveInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8c446b9", new Object[]{this, mediaLiveInfo, str});
            return;
        }
        C0("setDataSource mCurMediaState = " + d0(this.f13225a));
        Z0();
        b2();
        this.O = str;
        if (mediaLiveInfo != null) {
            s.d dVar = this.f;
            dVar.U = mediaLiveInfo;
            dVar.k = 0;
        } else if (!TextUtils.isEmpty(str)) {
            s.d dVar2 = this.f;
            dVar2.l = this.O;
            dVar2.k = 2;
        }
    }

    public final void b2() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f99cb79", new Object[]{this});
            return;
        }
        cdr cdrVar = this.c;
        if (cdrVar != null && cdrVar.j() != null && ejr.m(this.c.j())) {
            cdr cdrVar2 = this.c;
            boolean z2 = (cdrVar2 == null || cdrVar2.w0() == null) ? true : this.c.w0().isFirst;
            if (Build.VERSION.SDK_INT >= ejr.u(30)) {
                z = true;
            }
            C0("setRenderType isFirstPosition = " + z2 + " sdkEnable = " + z);
            if (!z) {
                return;
            }
            if (!z2 || pvs.A1()) {
                C1(true);
            }
        }
    }

    public LiveStatePlayer(Context context, cdr cdrVar) {
        super(context, cdrVar);
        this.P = 2;
        e2();
    }

    public void h2(List<MediaData.QualityLiveItem> list, IMediaPlayer.UpdataUrlListMode updataUrlListMode) {
        MediaPlayCenter.UpdataUrlListMode updataUrlListMode2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1a8398b", new Object[]{this, list, updataUrlListMode});
        } else if (this.e != null) {
            ulq.f(list);
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("list", ulq.c(list));
            int i = a.$SwitchMap$com$taobao$taolive$sdk$ui$media$IMediaPlayer$UpdataUrlListMode[updataUrlListMode.ordinal()];
            if (i == 1) {
                updataUrlListMode2 = MediaPlayCenter.UpdataUrlListMode.INIT;
            } else if (i != 2) {
                updataUrlListMode2 = i != 3 ? null : MediaPlayCenter.UpdataUrlListMode.REPLACE_FORCE_OF_NEW_DEFINITION;
            } else {
                updataUrlListMode2 = MediaPlayCenter.UpdataUrlListMode.REPLACE_BY_URL_ID_OF_NEW_DEFINITION;
            }
            hashMap.put("mode", updataUrlListMode2);
            this.e.c("updateUrlList", hashMap);
        }
    }
}
