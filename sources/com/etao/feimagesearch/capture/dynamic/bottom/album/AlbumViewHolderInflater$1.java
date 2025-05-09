package com.etao.feimagesearch.capture.dynamic.bottom.album;

import android.app.Activity;
import android.os.HandlerThread;
import android.view.View;
import android.view.ViewGroup;
import androidx.asynclayoutinflater.view.AsyncLayoutInflater;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import java.util.concurrent.atomic.AtomicInteger;
import tb.agh;
import tb.q73;
import tb.sk0;
import tb.zio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AlbumViewHolderInflater$1 extends zio {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ CaptureManager d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ViewGroup f;
    public final /* synthetic */ q73 g;
    public final /* synthetic */ HandlerThread h;
    public final /* synthetic */ sk0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlbumViewHolderInflater$1(sk0 sk0Var, String str, Activity activity, CaptureManager captureManager, int i, ViewGroup viewGroup, q73 q73Var, HandlerThread handlerThread) {
        super(str);
        this.c = activity;
        this.d = captureManager;
        this.e = i;
        this.f = viewGroup;
        this.h = handlerThread;
    }

    public static /* synthetic */ Object ipc$super(AlbumViewHolderInflater$1 albumViewHolderInflater$1, String str, Object... objArr) {
        if (str.hashCode() == -816534907) {
            super.b((Throwable) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/bottom/album/AlbumViewHolderInflater$1");
    }

    @Override // tb.zio
    public void b(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            return;
        }
        super.b(th);
        agh.r("PltCamera", "AutoSize__Bottom_AlbumViewHolderInflater", agh.f("inflate error", th));
        this.h.quitSafely();
    }

    @Override // tb.zio
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            return;
        }
        AsyncLayoutInflater asyncLayoutInflater = new AsyncLayoutInflater(this.c);
        int a2 = sk0.a(null, this.c, this.d);
        agh.h("AutoSize__Bottom_AlbumViewHolderInflater", "viewCount: " + a2);
        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (int i = 0; i < a2; i++) {
            asyncLayoutInflater.inflate(this.e, this.f, new AsyncLayoutInflater.OnInflateFinishedListener(atomicInteger, a2) { // from class: com.etao.feimagesearch.capture.dynamic.bottom.album.AlbumViewHolderInflater$1.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // androidx.asynclayoutinflater.view.AsyncLayoutInflater.OnInflateFinishedListener
                public void onInflateFinished(View view, int i2, ViewGroup viewGroup) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e9e04771", new Object[]{this, view, new Integer(i2), viewGroup});
                        return;
                    }
                    agh.h("AutoSize__Bottom_AlbumViewHolderInflater", "onInflateFinished");
                    view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    AlbumViewHolderInflater$1.this.getClass();
                    int i3 = AlbumViewHolderInflater$1.this.e;
                    throw null;
                }
            });
        }
    }
}
