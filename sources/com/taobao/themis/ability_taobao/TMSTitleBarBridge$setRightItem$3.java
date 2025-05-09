package com.taobao.themis.ability_taobao;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.utils.TMSResourceUtils;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.c7o;
import tb.ckf;
import tb.d1a;
import tb.ekd;
import tb.w2n;
import tb.xhv;
import tb.y0e;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSTitleBarBridge$setRightItem$3 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ CountDownLatch $countDownLatch;
    public final /* synthetic */ Ref$ObjectRef<JSONObject> $frame;
    public final /* synthetic */ String $icon;
    public final /* synthetic */ View.OnClickListener $onClickListener;
    public final /* synthetic */ ITMSPage $page;
    public final /* synthetic */ y0e $titleBar;
    public final /* synthetic */ TMSTitleBarBridge this$0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef<JSONObject> f13464a;
        public final /* synthetic */ TMSTitleBarBridge b;
        public final /* synthetic */ y0e c;
        public final /* synthetic */ View d;
        public final /* synthetic */ CountDownLatch e;

        public a(Ref$ObjectRef<JSONObject> ref$ObjectRef, TMSTitleBarBridge tMSTitleBarBridge, y0e y0eVar, View view, CountDownLatch countDownLatch) {
            this.f13464a = ref$ObjectRef;
            this.b = tMSTitleBarBridge;
            this.c = y0eVar;
            this.d = view;
            this.e = countDownLatch;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [T, com.alibaba.fastjson.JSONObject] */
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            this.f13464a.element = TMSTitleBarBridge.access$getActionLocationAndSize(this.b, this.c, this.d);
            this.e.countDown();
            this.d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSTitleBarBridge$setRightItem$3(y0e y0eVar, String str, View.OnClickListener onClickListener, ITMSPage iTMSPage, CountDownLatch countDownLatch, Ref$ObjectRef<JSONObject> ref$ObjectRef, TMSTitleBarBridge tMSTitleBarBridge) {
        super(0);
        this.$titleBar = y0eVar;
        this.$icon = str;
        this.$onClickListener = onClickListener;
        this.$page = iTMSPage;
        this.$countDownLatch = countDownLatch;
        this.$frame = ref$ObjectRef;
        this.this$0 = tMSTitleBarBridge;
    }

    public static /* synthetic */ Object ipc$super(TMSTitleBarBridge$setRightItem$3 tMSTitleBarBridge$setRightItem$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/ability_taobao/TMSTitleBarBridge$setRightItem$3");
    }

    /* JADX WARN: Type inference failed for: r1v24, types: [T, com.alibaba.fastjson.JSONObject] */
    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        byte[] bytes;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        w2n w2nVar = (w2n) this.$titleBar.getAction(w2n.class);
        if (w2nVar != null) {
            Ref$ObjectRef<JSONObject> ref$ObjectRef = this.$frame;
            TMSTitleBarBridge tMSTitleBarBridge = this.this$0;
            y0e y0eVar = this.$titleBar;
            ITMSPage iTMSPage = this.$page;
            CountDownLatch countDownLatch = this.$countDownLatch;
            Activity I = iTMSPage.getInstance().I();
            ckf.f(I, "page.getInstance().activity");
            ref$ObjectRef.element = TMSTitleBarBridge.access$getActionLocationAndSize(tMSTitleBarBridge, y0eVar, w2nVar.l(I));
            countDownLatch.countDown();
        }
        if (!TextUtils.isEmpty(this.$icon)) {
            String str = this.$icon;
            ckf.d(str);
            TMSResourceUtils.ResourceType a2 = TMSResourceUtils.a(str);
            ckf.f(a2, "getResourceType(icon!!)");
            if (a2 != TMSResourceUtils.ResourceType.INTERNAL) {
                this.$titleBar.addRightButton(this.$icon, this.$onClickListener);
            } else {
                ekd ekdVar = (ekd) this.$page.getInstance().getExtension(ekd.class);
                c7o Y = ekdVar == null ? null : ekdVar.Y(this.$icon);
                if (!(Y == null || (bytes = Y.getBytes()) == null)) {
                    this.$titleBar.addRightButton(new BitmapDrawable(Resources.getSystem(), BitmapFactory.decodeByteArray(bytes, 0, bytes.length)), this.$onClickListener);
                }
            }
        }
        if (this.$titleBar.getAction(w2n.class) == null) {
            this.$countDownLatch.countDown();
        } else if (this.$frame.element == null) {
            w2n w2nVar2 = (w2n) this.$titleBar.getAction(w2n.class);
            if (w2nVar2 != null) {
                Activity I2 = this.$page.getInstance().I();
                ckf.f(I2, "page.getInstance().activity");
                View l = w2nVar2.l(I2);
                if (l != null) {
                    Ref$ObjectRef<JSONObject> ref$ObjectRef2 = this.$frame;
                    TMSTitleBarBridge tMSTitleBarBridge2 = this.this$0;
                    y0e y0eVar2 = this.$titleBar;
                    CountDownLatch countDownLatch2 = this.$countDownLatch;
                    ViewTreeObserver viewTreeObserver = l.getViewTreeObserver();
                    ckf.f(viewTreeObserver, "view.viewTreeObserver");
                    viewTreeObserver.addOnGlobalLayoutListener(new a(ref$ObjectRef2, tMSTitleBarBridge2, y0eVar2, l, countDownLatch2));
                }
            }
        } else {
            this.$countDownLatch.countDown();
        }
    }
}
