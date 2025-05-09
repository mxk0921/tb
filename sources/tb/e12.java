package tb;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.s;
import com.taobao.taolive.room.player.standard.state.BaseStatePlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class e12 implements uvd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f18201a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Drawable c;
    public final /* synthetic */ BaseStatePlayer d;

    public e12(BaseStatePlayer baseStatePlayer, String str, int i, Drawable drawable) {
        this.d = baseStatePlayer;
        this.f18201a = str;
        this.b = i;
        this.c = drawable;
    }

    @Override // tb.uvd
    public void onError(Object obj) {
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb5434c", new Object[]{this, obj});
            return;
        }
        BaseStatePlayer baseStatePlayer = this.d;
        baseStatePlayer.C0("setVideoCoverImage onFail = " + this.f18201a);
        if (this.b != 0) {
            drawable = this.d.d.getResources().getDrawable(this.b);
        } else {
            drawable = this.c;
        }
        BaseStatePlayer baseStatePlayer2 = this.d;
        BaseStatePlayer.j(baseStatePlayer2, baseStatePlayer2.e, drawable);
    }

    @Override // tb.uvd
    public void onSuccess(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
            return;
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
        BaseStatePlayer baseStatePlayer = this.d;
        s sVar = baseStatePlayer.e;
        if (sVar != null && baseStatePlayer.f13225a != 5) {
            BaseStatePlayer.j(baseStatePlayer, sVar, bitmapDrawable);
        }
    }
}
