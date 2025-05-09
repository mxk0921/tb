package com.taobao.android.turbo.adapter.impl;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import tb.a07;
import tb.b1m;
import tb.cec;
import tb.ckf;
import tb.doe;
import tb.nd2;
import tb.njg;
import tb.o1m;
import tb.p1m;
import tb.qle;
import tb.s0m;
import tb.s8d;
import tb.t2o;
import tb.tpu;
import tb.wzh;
import tb.xct;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ImageLoaderAdapter implements cec {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final njg f9723a = kotlin.a.b(ImageLoaderAdapter$Companion$instance$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(919601190);
        }

        public a() {
        }

        public final ImageLoaderAdapter a() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("1620d0c7", new Object[]{this});
            } else {
                value = ImageLoaderAdapter.b().getValue();
            }
            return (ImageLoaderAdapter) value;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b<T extends b1m> implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cec.a f9724a;

        public b(cec.a aVar) {
            this.f9724a = aVar;
        }

        /* renamed from: a */
        public final boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            cec.a aVar = this.f9724a;
            if (aVar != null) {
                ckf.f(failPhenixEvent, "failPhenixEvent");
                aVar.onImageLoadFailed(failPhenixEvent.getResultCode());
            }
            ckf.f(failPhenixEvent, "failPhenixEvent");
            p1m ticket = failPhenixEvent.getTicket();
            ckf.f(ticket, "failPhenixEvent.ticket");
            ticket.d(true);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class c<T extends b1m> implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cec.a f9725a;

        public c(cec.a aVar) {
            this.f9725a = aVar;
        }

        /* renamed from: a */
        public final boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            ckf.f(succPhenixEvent, "succPhenixEvent");
            if (succPhenixEvent.getDrawable() != null && !succPhenixEvent.isIntermediate()) {
                BitmapDrawable drawable = succPhenixEvent.getDrawable();
                cec.a aVar = this.f9725a;
                if (aVar != null) {
                    String url = succPhenixEvent.getUrl();
                    ckf.f(url, "succPhenixEvent.url");
                    ckf.f(drawable, IWebViewExtension.SNAPSHOT_BUNDLE_KEY_BITMAP);
                    aVar.onImageLoaded(url, drawable);
                }
                p1m ticket = succPhenixEvent.getTicket();
                ckf.f(ticket, "succPhenixEvent.ticket");
                ticket.d(true);
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class d<T extends b1m> implements s8d<b1m> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final d INSTANCE = new d();

        @Override // tb.s8d
        public final boolean onHappen(b1m b1mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6b6cca12", new Object[]{this, b1mVar})).booleanValue();
            }
            return true;
        }
    }

    static {
        t2o.a(919601189);
        t2o.a(919601165);
    }

    public static final /* synthetic */ njg b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("fb99327c", new Object[0]);
        }
        return f9723a;
    }

    @Override // tb.cec
    public xct a(qle qleVar, cec.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xct) ipChange.ipc$dispatch("150731b8", new Object[]{this, qleVar, aVar});
        }
        ckf.g(qleVar, "imageInfo");
        o1m o1mVar = new o1m();
        o1mVar.a(1);
        o1mVar.b(c(qleVar, aVar));
        return o1mVar;
    }

    public final p1m c(qle qleVar, cec.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p1m) ipChange.ipc$dispatch("6d5b1a1c", new Object[]{this, qleVar, aVar});
        }
        String f = qleVar.f();
        String h = qleVar.h();
        Context c2 = qleVar.c();
        int i = qleVar.i();
        int d2 = qleVar.d();
        PhenixCreator T = s0m.B().N0(c2).T(h);
        if (qleVar.l()) {
            T.forceHighQualityAccess(true);
        }
        if (qleVar.m()) {
            T.heightScale(true);
        }
        tpu.a aVar2 = tpu.Companion;
        tpu.a.b(aVar2, "ImageLoaderAdapter", "loadImage " + h + ", forceHighQuality " + qleVar.l() + " heightScale " + qleVar.m(), null, 4, null);
        T.addLoaderExtra(nd2.BUNDLE_BIZ_CODE, qleVar.k()).memOnly(false).schedulePriority(qleVar.g()).failListener(new b(aVar)).succListener(new c(aVar)).cancelListener(d.INSTANCE);
        if (!(i == -1 || d2 == -1)) {
            T.limitSize(null, i, d2);
        }
        T.handler(new wzh());
        if (!TextUtils.equals(f, h) && !TextUtils.isEmpty(f)) {
            T.retryHandler(new doe().a(f));
        }
        p1m fetch = T.fetch();
        fetch.e(h);
        return fetch;
    }
}
