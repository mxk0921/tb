package com.taobao.taolive.room.player.standard.manager;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.player.standard.manager.a;
import com.taobao.taolive.room.player.standard.state.BaseStatePlayer;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.uc.webview.export.media.CommandID;
import tb.cdr;
import tb.pvs;
import tb.q1o;
import tb.sya;
import tb.t2o;
import tb.z1o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class b extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public z1o d;

    static {
        t2o.a(779093181);
    }

    public b(a.h hVar) {
        super(hVar);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        if (str.hashCode() == -1664206608) {
            super.G1((VideoInfo) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/player/standard/manager/ReplayMediaManager");
    }

    @Override // com.taobao.taolive.room.player.standard.manager.a
    public boolean C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60d284dc", new Object[]{this})).booleanValue();
        }
        return this.d.o0();
    }

    public final void U1(String str) {
        q1o g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ba5a78f", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            if (!(this.f13215a == null || (g = new sya(this.f13215a.d).g()) == null || !sya.e(g.f26450a, str))) {
                long j = g.c;
                if (j > 0) {
                    this.d.y1((int) j);
                    return;
                }
            }
            Uri parse = Uri.parse(str);
            String queryParameter = parse != null ? parse.getQueryParameter(CommandID.seekTo) : null;
            if (!TextUtils.isEmpty(queryParameter) && queryParameter.contains(".")) {
                this.d.y1(((int) Float.parseFloat(queryParameter)) * 1000);
            } else if (!TextUtils.isEmpty(queryParameter) && TextUtils.isDigitsOnly(queryParameter)) {
                this.d.y1(Integer.parseInt(queryParameter) * 1000);
            }
        }
    }

    public void V1(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a214e96b", new Object[]{this, str, str2});
        } else if (pvs.E()) {
            W1(str, str2, true);
        }
    }

    public final void W1(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21da1cc8", new Object[]{this, str, str2, new Boolean(z)});
        } else if (this.d.y0()) {
            O0("回放已经起播");
        } else {
            this.d.V1(str);
            U1(str);
            this.d.K();
            O0("startPlay，addVideoView");
            R();
            if (z) {
                e1();
                Q1(str2, this.f13215a.c);
            } else if (this.d.I1()) {
                Q1(str2, this.f13215a.c);
            }
        }
    }

    @Override // com.taobao.taolive.room.player.standard.manager.a
    public BaseStatePlayer d0(Context context, cdr cdrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseStatePlayer) ipChange.ipc$dispatch("ecd372ab", new Object[]{this, context, cdrVar});
        }
        z1o z1oVar = new z1o(context, cdrVar);
        this.d = z1oVar;
        return z1oVar;
    }

    @Override // com.taobao.taolive.room.player.standard.manager.a
    public int o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("663b319f", new Object[]{this})).intValue();
        }
        return 2;
    }

    @Override // com.taobao.taolive.room.player.standard.manager.a
    public void G1(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cce38f0", new Object[]{this, videoInfo});
            return;
        }
        super.G1(videoInfo);
        W1(videoInfo.replayUrl, "mtopReplayUrl", false);
        k1();
    }
}
