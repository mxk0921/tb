package com.alibaba.ability.impl.audio.floatwindow;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import tb.a07;
import tb.ckf;
import tb.t2o;
import tb.te;
import tb.ywo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class AudioFloatWindow extends AbsFloatWindow {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AudioCollapse audioCollapse;
    private AudioExpand audioExpand;
    private boolean isPlaying;
    private te playParams;
    private a triggerListener;

    /* compiled from: Taobao */
    @Target({ElementType.TYPE, ElementType.PARAMETER, ElementType.TYPE_USE})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.TYPE})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public @interface StatusCode {
        public static final a Companion = a.$$INSTANCE;
        public static final int STATUS_CODE_CLOSE = 2;
        public static final int STATUS_CODE_OPEN = 3;
        public static final int STATUS_CODE_PAUSE = 1;
        public static final int STATUS_CODE_PLAY = 0;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class a {
            public static final /* synthetic */ a $$INSTANCE = new a();
            public static final int STATUS_CODE_CLOSE = 2;
            public static final int STATUS_CODE_OPEN = 3;
            public static final int STATUS_CODE_PAUSE = 1;
            public static final int STATUS_CODE_PLAY = 0;

            static {
                t2o.a(98566204);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
        void a(int i, Object obj);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                AudioFloatWindow.access$collapse(AudioFloatWindow.this);
            }
        }
    }

    static {
        t2o.a(98566202);
    }

    public /* synthetic */ AudioFloatWindow(Context context, a aVar, AttributeSet attributeSet, int i, int i2, a07 a07Var) {
        this(context, aVar, (i2 & 4) != 0 ? null : attributeSet, (i2 & 8) != 0 ? 0 : i);
    }

    public static final /* synthetic */ void access$collapse(AudioFloatWindow audioFloatWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ae1cf2", new Object[]{audioFloatWindow});
        } else {
            audioFloatWindow.collapse();
        }
    }

    public static final /* synthetic */ void access$expand(AudioFloatWindow audioFloatWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b375d7a5", new Object[]{audioFloatWindow});
        } else {
            audioFloatWindow.expand();
        }
    }

    private final void collapse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fa509b4", new Object[]{this});
            return;
        }
        AudioExpand audioExpand = this.audioExpand;
        ckf.d(audioExpand);
        audioExpand.setVisibility(4);
        AudioCollapse audioCollapse = this.audioCollapse;
        ckf.d(audioCollapse);
        audioCollapse.setVisibility(0);
    }

    private final void expand() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20198621", new Object[]{this});
            return;
        }
        if (this.audioExpand == null) {
            Context context = getContext();
            ckf.f(context, "context");
            Context applicationContext = context.getApplicationContext();
            ckf.f(applicationContext, "context.applicationContext");
            AudioExpand audioExpand = new AudioExpand(applicationContext, this.triggerListener, null, 0, 12, null);
            this.audioExpand = audioExpand;
            addView(audioExpand);
            AudioExpand audioExpand2 = this.audioExpand;
            if (audioExpand2 != null) {
                audioExpand2.defaultPlaying = this.isPlaying;
            }
            if (audioExpand2 != null) {
                te teVar = this.playParams;
                ckf.d(teVar);
                audioExpand2.play(teVar);
            }
            AudioExpand audioExpand3 = this.audioExpand;
            if (audioExpand3 != null) {
                audioExpand3.setOnClickListener(new b());
            }
        }
        AudioCollapse audioCollapse = this.audioCollapse;
        ckf.d(audioCollapse);
        audioCollapse.setVisibility(4);
        AudioExpand audioExpand4 = this.audioExpand;
        ckf.d(audioExpand4);
        audioExpand4.setVisibility(0);
        int[] iArr = new int[2];
        AudioCollapse audioCollapse2 = this.audioCollapse;
        ckf.d(audioCollapse2);
        audioCollapse2.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        if (i <= 0) {
            Context context2 = getContext();
            ckf.f(context2, "context");
            int a2 = i2 - ywo.a(context2, 10.5f);
            AudioExpand audioExpand5 = this.audioExpand;
            ckf.d(audioExpand5);
            audioExpand5.layout(0, a2, false);
            AudioExpand audioExpand6 = this.audioExpand;
            ckf.d(audioExpand6);
            audioExpand6.showOpenTranslateAnimation(false);
            return;
        }
        Context context3 = getContext();
        ckf.f(context3, "context");
        int i3 = ywo.b(context3).widthPixels;
        Context context4 = getContext();
        ckf.f(context4, "context");
        int a3 = i3 - ywo.a(context4, 169.0f);
        Context context5 = getContext();
        ckf.f(context5, "context");
        int a4 = i2 - ywo.a(context5, 10.5f);
        AudioExpand audioExpand7 = this.audioExpand;
        ckf.d(audioExpand7);
        audioExpand7.layout(a3, a4, true);
        AudioExpand audioExpand8 = this.audioExpand;
        ckf.d(audioExpand8);
        audioExpand8.showOpenTranslateAnimation(true);
    }

    private final void initLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4adf07e1", new Object[]{this});
            return;
        }
        Context context = getContext();
        ckf.f(context, "context");
        Context applicationContext = context.getApplicationContext();
        ckf.f(applicationContext, "context.applicationContext");
        AudioCollapse audioCollapse = new AudioCollapse(applicationContext, new AudioFloatWindow$initLayout$1(this), null, 0, 12, null);
        this.audioCollapse = audioCollapse;
        addView(audioCollapse);
    }

    public static /* synthetic */ Object ipc$super(AudioFloatWindow audioFloatWindow, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/audio/floatwindow/AudioFloatWindow");
    }

    public final void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        AudioExpand audioExpand = this.audioExpand;
        if (audioExpand != null) {
            audioExpand.pause();
        }
        AudioCollapse audioCollapse = this.audioCollapse;
        if (audioCollapse != null) {
            audioCollapse.pause();
        }
        this.isPlaying = false;
    }

    public final void play(te teVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c81e090c", new Object[]{this, teVar});
            return;
        }
        ckf.g(teVar, "playParams");
        AudioExpand audioExpand = this.audioExpand;
        if (audioExpand != null) {
            audioExpand.play(teVar);
        }
        this.playParams = teVar;
        this.isPlaying = true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AudioFloatWindow(android.content.Context r2, com.alibaba.ability.impl.audio.floatwindow.AudioFloatWindow.a r3, android.util.AttributeSet r4, int r5) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            tb.ckf.g(r2, r0)
            java.lang.String r0 = "triggerListener"
            tb.ckf.g(r3, r0)
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r0 = "context.applicationContext"
            tb.ckf.f(r2, r0)
            r1.<init>(r2, r4, r5)
            r1.triggerListener = r3
            r2 = 1
            r1.isPlaying = r2
            r2 = 0
            r1.level = r2
            r1.initLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.audio.floatwindow.AudioFloatWindow.<init>(android.content.Context, com.alibaba.ability.impl.audio.floatwindow.AudioFloatWindow$a, android.util.AttributeSet, int):void");
    }

    public final void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        AudioExpand audioExpand = this.audioExpand;
        if (audioExpand != null) {
            audioExpand.play();
        }
        AudioCollapse audioCollapse = this.audioCollapse;
        if (audioCollapse != null) {
            audioCollapse.play();
        }
        this.isPlaying = true;
    }
}
