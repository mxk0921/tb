package com.alibaba.ability.impl.speechrecognition.panel;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ability.impl.speechrecognition.nui.SpeechRecognizer;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.SpeechRecognitionResult;
import com.taobao.android.megadesign.speechRecognition.MegaSpeechRecognitionAnimationView;
import com.taobao.android.megadesign.speechRecognition.MegaTextTypeView;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.Map;
import tb.a07;
import tb.cjf;
import tb.ckf;
import tb.d1a;
import tb.f0m;
import tb.fji;
import tb.gf0;
import tb.gji;
import tb.jgb;
import tb.olq;
import tb.ppl;
import tb.prd;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class MegaSpeechRecognitionPanelFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public MegaTextTypeView f2044a;
    public MegaSpeechRecognitionAnimationView c;
    public Button d;
    public TextView e;
    public TextView f;
    public ImageView g;
    public TUrlImageView h;
    public View i;
    public View j;
    public boolean k;
    public boolean l = true;
    public SpeechRecognizer m;
    public int n;
    public int o;
    public prd p;
    public boolean q;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(133169181);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class d implements MegaTextTypeView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.android.megadesign.speechRecognition.MegaTextTypeView.a
        public void a(int i, int i2) {
            int i3 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a124b895", new Object[]{this, new Integer(i), new Integer(i2)});
            } else if (i2 > 1) {
                ViewGroup.LayoutParams layoutParams = MegaSpeechRecognitionPanelFragment.z2(MegaSpeechRecognitionPanelFragment.this).getLayoutParams();
                FragmentActivity activity = MegaSpeechRecognitionPanelFragment.this.getActivity();
                if (activity != null) {
                    i3 = ppl.INSTANCE.a(activity, 264.0f) + i;
                }
                layoutParams.height = i3;
                MegaSpeechRecognitionPanelFragment.z2(MegaSpeechRecognitionPanelFragment.this).setLayoutParams(layoutParams);
            }
        }
    }

    static {
        t2o.a(133169180);
    }

    public static final /* synthetic */ MegaTextTypeView A2(MegaSpeechRecognitionPanelFragment megaSpeechRecognitionPanelFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MegaTextTypeView) ipChange.ipc$dispatch("18d46ad4", new Object[]{megaSpeechRecognitionPanelFragment});
        }
        MegaTextTypeView megaTextTypeView = megaSpeechRecognitionPanelFragment.f2044a;
        if (megaTextTypeView != null) {
            return megaTextTypeView;
        }
        ckf.y("textTypeView");
        throw null;
    }

    public static final /* synthetic */ MegaSpeechRecognitionAnimationView B2(MegaSpeechRecognitionPanelFragment megaSpeechRecognitionPanelFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MegaSpeechRecognitionAnimationView) ipChange.ipc$dispatch("8b23f037", new Object[]{megaSpeechRecognitionPanelFragment});
        }
        MegaSpeechRecognitionAnimationView megaSpeechRecognitionAnimationView = megaSpeechRecognitionPanelFragment.c;
        if (megaSpeechRecognitionAnimationView != null) {
            return megaSpeechRecognitionAnimationView;
        }
        ckf.y("voiceAnimationView");
        throw null;
    }

    public static final /* synthetic */ boolean C2(MegaSpeechRecognitionPanelFragment megaSpeechRecognitionPanelFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1cedcd37", new Object[]{megaSpeechRecognitionPanelFragment})).booleanValue();
        }
        return megaSpeechRecognitionPanelFragment.k;
    }

    public static final /* synthetic */ boolean D2(MegaSpeechRecognitionPanelFragment megaSpeechRecognitionPanelFragment, MotionEvent motionEvent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e133df96", new Object[]{megaSpeechRecognitionPanelFragment, motionEvent, view})).booleanValue();
        }
        return megaSpeechRecognitionPanelFragment.b3(motionEvent, view);
    }

    public static final /* synthetic */ boolean E2(MegaSpeechRecognitionPanelFragment megaSpeechRecognitionPanelFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11c50252", new Object[]{megaSpeechRecognitionPanelFragment})).booleanValue();
        }
        return megaSpeechRecognitionPanelFragment.q;
    }

    public static final /* synthetic */ void J2(MegaSpeechRecognitionPanelFragment megaSpeechRecognitionPanelFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5586d55", new Object[]{megaSpeechRecognitionPanelFragment});
        } else {
            megaSpeechRecognitionPanelFragment.c3();
        }
    }

    public static final /* synthetic */ void K2(MegaSpeechRecognitionPanelFragment megaSpeechRecognitionPanelFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4985d383", new Object[]{megaSpeechRecognitionPanelFragment});
        } else {
            megaSpeechRecognitionPanelFragment.d3();
        }
    }

    public static final /* synthetic */ void M2(MegaSpeechRecognitionPanelFragment megaSpeechRecognitionPanelFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("399b7e58", new Object[]{megaSpeechRecognitionPanelFragment, new Boolean(z)});
        } else {
            megaSpeechRecognitionPanelFragment.e3(z);
        }
    }

    public static final /* synthetic */ void N2(MegaSpeechRecognitionPanelFragment megaSpeechRecognitionPanelFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3619601", new Object[]{megaSpeechRecognitionPanelFragment});
        } else {
            megaSpeechRecognitionPanelFragment.f3();
        }
    }

    public static final /* synthetic */ void O2(MegaSpeechRecognitionPanelFragment megaSpeechRecognitionPanelFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e905484b", new Object[]{megaSpeechRecognitionPanelFragment});
        } else {
            megaSpeechRecognitionPanelFragment.g3();
        }
    }

    public static final /* synthetic */ void Q2(MegaSpeechRecognitionPanelFragment megaSpeechRecognitionPanelFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b9cd57a", new Object[]{megaSpeechRecognitionPanelFragment});
        } else {
            megaSpeechRecognitionPanelFragment.h3();
        }
    }

    public static final /* synthetic */ void R2(MegaSpeechRecognitionPanelFragment megaSpeechRecognitionPanelFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcffd142", new Object[]{megaSpeechRecognitionPanelFragment, new Boolean(z)});
        } else {
            megaSpeechRecognitionPanelFragment.l = z;
        }
    }

    public static final /* synthetic */ void S2(MegaSpeechRecognitionPanelFragment megaSpeechRecognitionPanelFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80002449", new Object[]{megaSpeechRecognitionPanelFragment, new Boolean(z)});
        } else {
            megaSpeechRecognitionPanelFragment.k = z;
        }
    }

    public static /* synthetic */ Object ipc$super(MegaSpeechRecognitionPanelFragment megaSpeechRecognitionPanelFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 462397159) {
            super.onDestroyView();
            return null;
        } else if (hashCode == 797441118) {
            super.onPause();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/ability/impl/speechrecognition/panel/MegaSpeechRecognitionPanelFragment");
        }
    }

    public static final /* synthetic */ void p2(MegaSpeechRecognitionPanelFragment megaSpeechRecognitionPanelFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("748be999", new Object[]{megaSpeechRecognitionPanelFragment});
        } else {
            megaSpeechRecognitionPanelFragment.T2();
        }
    }

    public static final /* synthetic */ boolean r2(MegaSpeechRecognitionPanelFragment megaSpeechRecognitionPanelFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47f99dca", new Object[]{megaSpeechRecognitionPanelFragment})).booleanValue();
        }
        return megaSpeechRecognitionPanelFragment.l;
    }

    public static final /* synthetic */ TextView s2(MegaSpeechRecognitionPanelFragment megaSpeechRecognitionPanelFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("6f2f4e8b", new Object[]{megaSpeechRecognitionPanelFragment});
        }
        TextView textView = megaSpeechRecognitionPanelFragment.f;
        if (textView != null) {
            return textView;
        }
        ckf.y("loadingTextView");
        throw null;
    }

    public static final /* synthetic */ Button u2(MegaSpeechRecognitionPanelFragment megaSpeechRecognitionPanelFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Button) ipChange.ipc$dispatch("5dc430a4", new Object[]{megaSpeechRecognitionPanelFragment});
        }
        Button button = megaSpeechRecognitionPanelFragment.d;
        if (button != null) {
            return button;
        }
        ckf.y("pressButton");
        throw null;
    }

    public static final /* synthetic */ prd v2(MegaSpeechRecognitionPanelFragment megaSpeechRecognitionPanelFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (prd) ipChange.ipc$dispatch("a8f94a29", new Object[]{megaSpeechRecognitionPanelFragment});
        }
        return megaSpeechRecognitionPanelFragment.p;
    }

    public static final /* synthetic */ View z2(MegaSpeechRecognitionPanelFragment megaSpeechRecognitionPanelFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e45359cf", new Object[]{megaSpeechRecognitionPanelFragment});
        }
        View view = megaSpeechRecognitionPanelFragment.j;
        if (view != null) {
            return view;
        }
        ckf.y("speechLayout");
        throw null;
    }

    public final void T2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb24ca9", new Object[]{this});
            return;
        }
        prd prdVar = this.p;
        if (prdVar != null) {
            SpeechRecognitionResult speechRecognitionResult = new SpeechRecognitionResult();
            MegaTextTypeView megaTextTypeView = this.f2044a;
            if (megaTextTypeView != null) {
                speechRecognitionResult.text = megaTextTypeView.getText();
                speechRecognitionResult.isFinal = Boolean.TRUE;
                xhv xhvVar = xhv.INSTANCE;
                prdVar.n0(speechRecognitionResult);
            } else {
                ckf.y("textTypeView");
                throw null;
            }
        }
        h3();
        olq.a(getActivity(), ppl.SPEECH_RECOGNITION_POP_ID);
    }

    public final void U2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4be0efe9", new Object[]{this});
            return;
        }
        Context context = getContext();
        if (context == null || f0m.INSTANCE.a(context, "android.permission.RECORD_AUDIO")) {
            MegaSpeechRecognitionPanelFragment$initButton$buttonRunnable$1 megaSpeechRecognitionPanelFragment$initButton$buttonRunnable$1 = new MegaSpeechRecognitionPanelFragment$initButton$buttonRunnable$1(this);
            Button button = this.d;
            if (button != null) {
                button.setOnTouchListener(new b(megaSpeechRecognitionPanelFragment$initButton$buttonRunnable$1));
            } else {
                ckf.y("pressButton");
                throw null;
            }
        } else {
            h3();
        }
    }

    public final void a3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        X2();
        U2();
        W2();
    }

    public final boolean b3(MotionEvent motionEvent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8b8fdea", new Object[]{this, motionEvent, view})).booleanValue();
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        float f = 0;
        if (x < f || x >= view.getWidth() || y < f || y >= view.getHeight()) {
            return false;
        }
        return true;
    }

    public final void e3(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e45de3ae", new Object[]{this, new Boolean(z)});
        } else if (z) {
            T2();
        } else {
            h3();
        }
    }

    public final void g3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("177ffc37", new Object[]{this});
            return;
        }
        this.k = false;
        this.l = true;
    }

    public final void j3(prd prdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84ce2a17", new Object[]{this, prdVar});
            return;
        }
        ckf.g(prdVar, "callback");
        this.p = prdVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        h3();
    }

    public final void X2() {
        SpeechRecognizer speechRecognizer;
        String str;
        String string;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf942edd", new Object[]{this});
            return;
        }
        Context context = getContext();
        if (context != null) {
            Bundle arguments = getArguments();
            String str2 = "";
            if (arguments == null || (str = arguments.getString("bizID")) == null) {
                str = str2;
            }
            SpeechRecognizer.b bVar = new SpeechRecognizer.b(null, null, null, null, null, 31, null);
            Bundle arguments2 = getArguments();
            if (!(arguments2 == null || (string = arguments2.getString("vocabularyID")) == null)) {
                str2 = string;
            }
            bVar.g(str2);
            Bundle arguments3 = getArguments();
            bVar.f(Boolean.valueOf(arguments3 != null ? arguments3.getBoolean("punctuation") : true));
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                z = arguments4.getBoolean("voiceDetection");
            }
            bVar.h(Boolean.valueOf(z));
            xhv xhvVar = xhv.INSTANCE;
            speechRecognizer = new SpeechRecognizer(context, str, bVar, new c(context, this));
        } else {
            speechRecognizer = null;
        }
        this.m = speechRecognizer;
    }

    public final void c3() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23f794ed", new Object[]{this});
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ppl.INSTANCE.f(activity, 50L);
        }
        TextView textView = this.e;
        String str = null;
        if (textView != null) {
            Context context = getContext();
            textView.setText(context != null ? context.getString(R.string.mega_voice_input_move_to_button_recover) : null);
            TextView textView2 = this.e;
            if (textView2 != null) {
                Context context2 = getContext();
                textView2.setTextColor(context2 != null ? ContextCompat.getColor(context2, R.color.tb_brand_tm) : 0);
                Button button = this.d;
                if (button != null) {
                    Context context3 = getContext();
                    if (context3 != null) {
                        i = ContextCompat.getColor(context3, R.color.tb_text_inverse);
                    }
                    button.setTextColor(i);
                    Button button2 = this.d;
                    if (button2 != null) {
                        Context context4 = getContext();
                        button2.setBackground(context4 != null ? context4.getDrawable(R.drawable.mega_voice_input_button_red_bg) : null);
                        Button button3 = this.d;
                        if (button3 != null) {
                            Context context5 = getContext();
                            if (context5 != null) {
                                str = context5.getString(R.string.mega_voice_input_release_to_cancel);
                            }
                            button3.setText(str);
                            return;
                        }
                        ckf.y("pressButton");
                        throw null;
                    }
                    ckf.y("pressButton");
                    throw null;
                }
                ckf.y("pressButton");
                throw null;
            }
            ckf.y("tipTextView");
            throw null;
        }
        ckf.y("tipTextView");
        throw null;
    }

    public final void d3() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e854dff", new Object[]{this});
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ppl.INSTANCE.f(activity, 50L);
        }
        TextView textView = this.e;
        String str = null;
        if (textView != null) {
            Context context = getContext();
            textView.setText(context != null ? context.getString(R.string.mega_voice_input_release_to_send_and_move_up_to_cancel) : null);
            TextView textView2 = this.e;
            if (textView2 != null) {
                Context context2 = getContext();
                textView2.setTextColor(context2 != null ? ContextCompat.getColor(context2, R.color.tb_text_secondary2) : 0);
                MegaTextTypeView megaTextTypeView = this.f2044a;
                if (megaTextTypeView != null) {
                    if (megaTextTypeView.getVisibility() == 0) {
                        Button button = this.d;
                        if (button != null) {
                            Context context3 = getContext();
                            if (context3 != null) {
                                i = ContextCompat.getColor(context3, R.color.tb_text_inverse);
                            }
                            button.setTextColor(i);
                        } else {
                            ckf.y("pressButton");
                            throw null;
                        }
                    } else {
                        i3();
                    }
                    Button button2 = this.d;
                    if (button2 != null) {
                        Context context4 = getContext();
                        button2.setBackground(context4 != null ? context4.getDrawable(R.drawable.mega_voice_input_button_orange_bg) : null);
                        Button button3 = this.d;
                        if (button3 != null) {
                            Context context5 = getContext();
                            if (context5 != null) {
                                str = context5.getString(R.string.mega_voice_input_release_to_send);
                            }
                            button3.setText(str);
                            return;
                        }
                        ckf.y("pressButton");
                        throw null;
                    }
                    ckf.y("pressButton");
                    throw null;
                }
                ckf.y("textTypeView");
                throw null;
            }
            ckf.y("tipTextView");
            throw null;
        }
        ckf.y("tipTextView");
        throw null;
    }

    public final void h3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b50ee28", new Object[]{this});
            return;
        }
        View view = this.j;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                FragmentActivity activity = getActivity();
                layoutParams.height = activity != null ? ppl.INSTANCE.a(activity, 291.0f) : 0;
            }
            View view2 = this.j;
            if (view2 != null) {
                view2.setLayoutParams(layoutParams);
                MegaSpeechRecognitionAnimationView megaSpeechRecognitionAnimationView = this.c;
                if (megaSpeechRecognitionAnimationView != null) {
                    megaSpeechRecognitionAnimationView.stopAnimation();
                    MegaSpeechRecognitionAnimationView megaSpeechRecognitionAnimationView2 = this.c;
                    if (megaSpeechRecognitionAnimationView2 != null) {
                        megaSpeechRecognitionAnimationView2.setVisibility(8);
                        MegaTextTypeView megaTextTypeView = this.f2044a;
                        if (megaTextTypeView != null) {
                            megaTextTypeView.resetState();
                            MegaTextTypeView megaTextTypeView2 = this.f2044a;
                            if (megaTextTypeView2 != null) {
                                megaTextTypeView2.setVisibility(8);
                                TextView textView = this.f;
                                if (textView != null) {
                                    textView.setVisibility(8);
                                    TextView textView2 = this.e;
                                    if (textView2 != null) {
                                        textView2.setVisibility(8);
                                        ImageView imageView = this.g;
                                        if (imageView != null) {
                                            imageView.setVisibility(0);
                                            Button button = this.d;
                                            if (button != null) {
                                                button.setVisibility(0);
                                                Button button2 = this.d;
                                                if (button2 != null) {
                                                    Context context = getContext();
                                                    button2.setBackground(context != null ? context.getDrawable(R.drawable.mega_voice_input_button_white_bg) : null);
                                                    Button button3 = this.d;
                                                    if (button3 != null) {
                                                        Context context2 = getContext();
                                                        button3.setText(context2 != null ? context2.getString(R.string.mega_voice_input_press_to_speak) : null);
                                                        Button button4 = this.d;
                                                        if (button4 != null) {
                                                            Context context3 = getContext();
                                                            button4.setTextColor(context3 != null ? ContextCompat.getColor(context3, R.color.tb_text_primary) : 0);
                                                            SpeechRecognizer speechRecognizer = this.m;
                                                            if (speechRecognizer != null) {
                                                                speechRecognizer.l();
                                                            }
                                                            this.q = false;
                                                            return;
                                                        }
                                                        ckf.y("pressButton");
                                                        throw null;
                                                    }
                                                    ckf.y("pressButton");
                                                    throw null;
                                                }
                                                ckf.y("pressButton");
                                                throw null;
                                            }
                                            ckf.y("pressButton");
                                            throw null;
                                        }
                                        ckf.y("initImageView");
                                        throw null;
                                    }
                                    ckf.y("tipTextView");
                                    throw null;
                                }
                                ckf.y("loadingTextView");
                                throw null;
                            }
                            ckf.y("textTypeView");
                            throw null;
                        }
                        ckf.y("textTypeView");
                        throw null;
                    }
                    ckf.y("voiceAnimationView");
                    throw null;
                }
                ckf.y("voiceAnimationView");
                throw null;
            }
            ckf.y("speechLayout");
            throw null;
        }
        ckf.y("speechLayout");
        throw null;
    }

    public final void i3() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2be7aa3", new Object[]{this});
            return;
        }
        Context context = getContext();
        if (context != null) {
            i = ContextCompat.getColor(context, R.color.tb_text_inverse);
        }
        int alphaComponent = ColorUtils.setAlphaComponent(i, 128);
        Button button = this.d;
        if (button != null) {
            button.setTextColor(alphaComponent);
        } else {
            ckf.y("pressButton");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        ckf.g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.mega_speech_recognition_layout, viewGroup, false);
        ckf.f(inflate, "inflater.inflate(R.layou…layout, container, false)");
        this.j = inflate;
        View findViewById = inflate.findViewById(R.id.mega_text_type_view);
        ckf.f(findViewById, "speechLayout.findViewByI…R.id.mega_text_type_view)");
        this.f2044a = (MegaTextTypeView) findViewById;
        View view = this.j;
        if (view != null) {
            View findViewById2 = view.findViewById(R.id.mega_voice_input_animation);
            ckf.f(findViewById2, "speechLayout.findViewByI…ga_voice_input_animation)");
            this.c = (MegaSpeechRecognitionAnimationView) findViewById2;
            View view2 = this.j;
            if (view2 != null) {
                View findViewById3 = view2.findViewById(R.id.mega_voice_input_button);
                ckf.f(findViewById3, "speechLayout.findViewByI….mega_voice_input_button)");
                this.d = (Button) findViewById3;
                View view3 = this.j;
                if (view3 != null) {
                    View findViewById4 = view3.findViewById(R.id.mega_voice_input_tips);
                    ckf.f(findViewById4, "speechLayout.findViewByI…id.mega_voice_input_tips)");
                    this.e = (TextView) findViewById4;
                    View view4 = this.j;
                    if (view4 != null) {
                        View findViewById5 = view4.findViewById(R.id.mega_voice_input_loading_text);
                        ckf.f(findViewById5, "speechLayout.findViewByI…voice_input_loading_text)");
                        this.f = (TextView) findViewById5;
                        View view5 = this.j;
                        if (view5 != null) {
                            View findViewById6 = view5.findViewById(R.id.mega_voice_input_icon);
                            ckf.f(findViewById6, "speechLayout.findViewByI…id.mega_voice_input_icon)");
                            this.g = (ImageView) findViewById6;
                            View view6 = this.j;
                            if (view6 != null) {
                                View findViewById7 = view6.findViewById(R.id.mega_voice_gradient_bg);
                                ckf.f(findViewById7, "speechLayout.findViewByI…d.mega_voice_gradient_bg)");
                                this.h = (TUrlImageView) findViewById7;
                                View view7 = this.j;
                                if (view7 != null) {
                                    View findViewById8 = view7.findViewById(R.id.mega_voice_place_holder);
                                    ckf.f(findViewById8, "speechLayout.findViewByI….mega_voice_place_holder)");
                                    this.i = findViewById8;
                                    MegaTextTypeView megaTextTypeView = this.f2044a;
                                    if (megaTextTypeView != null) {
                                        megaTextTypeView.setOnHeightChangeListener(new d());
                                        a3();
                                        View view8 = this.j;
                                        if (view8 != null) {
                                            return view8;
                                        }
                                        ckf.y("speechLayout");
                                        throw null;
                                    }
                                    ckf.y("textTypeView");
                                    throw null;
                                }
                                ckf.y("speechLayout");
                                throw null;
                            }
                            ckf.y("speechLayout");
                            throw null;
                        }
                        ckf.y("speechLayout");
                        throw null;
                    }
                    ckf.y("speechLayout");
                    throw null;
                }
                ckf.y("speechLayout");
                throw null;
            }
            ckf.y("speechLayout");
            throw null;
        }
        ckf.y("speechLayout");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        FragmentActivity activity;
        Window window;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        super.onDestroyView();
        h3();
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            z = ppl.INSTANCE.b(activity2);
        }
        if (z && (activity = getActivity()) != null && (window = activity.getWindow()) != null) {
            View decorView = window.getDecorView();
            ckf.f(decorView, "window.decorView");
            decorView.setSystemUiVisibility(this.n);
            window.setNavigationBarColor(this.o);
        }
    }

    public final void W2() {
        String str;
        Window window;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3628bacc", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.h;
        if (tUrlImageView != null) {
            jgb a2 = cjf.INSTANCE.a();
            if (a2 == null || !a2.a(getActivity())) {
                str = "https://gw.alicdn.com/imgextra/i4/O1CN01K9ltjG1FnhkSveXVp_!!6000000000532-2-tps-1500-656.png";
            } else {
                str = "https://gw.alicdn.com/imgextra/i4/O1CN01Rj6dWk1bHZV5eJ06K_!!6000000003440-2-tps-1500-432.png";
            }
            tUrlImageView.setImageUrl(str);
            TUrlImageView tUrlImageView2 = this.h;
            if (tUrlImageView2 != null) {
                tUrlImageView2.setWhenNullClearImg(true);
                TUrlImageView tUrlImageView3 = this.h;
                if (tUrlImageView3 != null) {
                    tUrlImageView3.setScaleType(ImageView.ScaleType.FIT_XY);
                    View view = this.i;
                    if (view != null) {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        FragmentActivity activity = getActivity();
                        if (activity != null ? ppl.INSTANCE.b(activity) : false) {
                            FragmentActivity activity2 = getActivity();
                            layoutParams.height = activity2 != null ? ppl.INSTANCE.a(activity2, 36.0f) : 0;
                            FragmentActivity activity3 = getActivity();
                            if (activity3 != null && (window = activity3.getWindow()) != null) {
                                View decorView = window.getDecorView();
                                ckf.f(decorView, "window.decorView");
                                this.n = decorView.getSystemUiVisibility();
                                this.o = window.getNavigationBarColor();
                                View decorView2 = window.getDecorView();
                                ckf.f(decorView2, "window.decorView");
                                decorView2.setSystemUiVisibility(gf0.V_RESULT_CODE_FOR_NO_ADDRESS);
                                window.setNavigationBarColor(0);
                                return;
                            }
                            return;
                        }
                        FragmentActivity activity4 = getActivity();
                        if (activity4 != null) {
                            i = ppl.INSTANCE.a(activity4, 16.0f);
                        }
                        layoutParams.height = i;
                        return;
                    }
                    ckf.y("placeHolderView");
                    throw null;
                }
                ckf.y("gradientBgView");
                throw null;
            }
            ckf.y("gradientBgView");
            throw null;
        }
        ckf.y("gradientBgView");
        throw null;
    }

    public final void f3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a43b18c1", new Object[]{this});
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ppl.INSTANCE.f(activity, 50L);
        }
        SpeechRecognizer speechRecognizer = this.m;
        if (speechRecognizer != null) {
            speechRecognizer.k();
        }
        ImageView imageView = this.g;
        String str = null;
        if (imageView != null) {
            imageView.setVisibility(8);
            Button button = this.d;
            if (button != null) {
                Context context = getContext();
                button.setText(context != null ? context.getString(R.string.mega_voice_input_release_to_send) : null);
                Button button2 = this.d;
                if (button2 != null) {
                    Context context2 = getContext();
                    button2.setBackground(context2 != null ? context2.getDrawable(R.drawable.mega_voice_input_button_orange_bg) : null);
                    i3();
                    MegaSpeechRecognitionAnimationView megaSpeechRecognitionAnimationView = this.c;
                    if (megaSpeechRecognitionAnimationView != null) {
                        megaSpeechRecognitionAnimationView.setVisibility(0);
                        TextView textView = this.f;
                        if (textView != null) {
                            textView.setVisibility(0);
                            TextView textView2 = this.e;
                            if (textView2 != null) {
                                textView2.setVisibility(0);
                                TextView textView3 = this.e;
                                if (textView3 != null) {
                                    Context context3 = getContext();
                                    if (context3 != null) {
                                        str = context3.getString(R.string.mega_voice_input_release_to_send_and_move_up_to_cancel);
                                    }
                                    textView3.setText(str);
                                    this.q = true;
                                    return;
                                }
                                ckf.y("tipTextView");
                                throw null;
                            }
                            ckf.y("tipTextView");
                            throw null;
                        }
                        ckf.y("loadingTextView");
                        throw null;
                    }
                    ckf.y("voiceAnimationView");
                    throw null;
                }
                ckf.y("pressButton");
                throw null;
            }
            ckf.y("pressButton");
            throw null;
        }
        ckf.y("initImageView");
        throw null;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ d1a b;

        public b(d1a d1aVar) {
            this.b = d1aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [tb.gji] */
        /* JADX WARN: Type inference failed for: r0v2, types: [tb.gji] */
        /* JADX WARN: Type inference failed for: r0v6, types: [tb.gji] */
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            ckf.f(motionEvent, "event");
            int action = motionEvent.getAction();
            if (action == 0) {
                d1a d1aVar = this.b;
                if (d1aVar != null) {
                    d1aVar = new gji(d1aVar);
                }
                view.postDelayed((Runnable) d1aVar, 300L);
                return true;
            } else if (action == 1) {
                d1a d1aVar2 = this.b;
                if (d1aVar2 != null) {
                    d1aVar2 = new gji(d1aVar2);
                }
                view.removeCallbacks((Runnable) d1aVar2);
                if (!MegaSpeechRecognitionPanelFragment.C2(MegaSpeechRecognitionPanelFragment.this)) {
                    return true;
                }
                MegaSpeechRecognitionPanelFragment megaSpeechRecognitionPanelFragment = MegaSpeechRecognitionPanelFragment.this;
                MegaSpeechRecognitionPanelFragment.M2(megaSpeechRecognitionPanelFragment, MegaSpeechRecognitionPanelFragment.r2(megaSpeechRecognitionPanelFragment));
                MegaSpeechRecognitionPanelFragment.O2(MegaSpeechRecognitionPanelFragment.this);
                return true;
            } else if (action != 2) {
                if (action != 3) {
                    return false;
                }
                MegaSpeechRecognitionPanelFragment.O2(MegaSpeechRecognitionPanelFragment.this);
                return true;
            } else if (MegaSpeechRecognitionPanelFragment.C2(MegaSpeechRecognitionPanelFragment.this)) {
                MegaSpeechRecognitionPanelFragment megaSpeechRecognitionPanelFragment2 = MegaSpeechRecognitionPanelFragment.this;
                ckf.f(view, "v");
                boolean D2 = MegaSpeechRecognitionPanelFragment.D2(megaSpeechRecognitionPanelFragment2, motionEvent, view);
                if (D2 && !MegaSpeechRecognitionPanelFragment.r2(MegaSpeechRecognitionPanelFragment.this)) {
                    MegaSpeechRecognitionPanelFragment.K2(MegaSpeechRecognitionPanelFragment.this);
                    MegaSpeechRecognitionPanelFragment.R2(MegaSpeechRecognitionPanelFragment.this, true);
                    return true;
                } else if (D2 || !MegaSpeechRecognitionPanelFragment.r2(MegaSpeechRecognitionPanelFragment.this)) {
                    return true;
                } else {
                    MegaSpeechRecognitionPanelFragment.J2(MegaSpeechRecognitionPanelFragment.this);
                    MegaSpeechRecognitionPanelFragment.R2(MegaSpeechRecognitionPanelFragment.this, false);
                    return true;
                }
            } else {
                MegaSpeechRecognitionPanelFragment megaSpeechRecognitionPanelFragment3 = MegaSpeechRecognitionPanelFragment.this;
                ckf.f(view, "v");
                if (MegaSpeechRecognitionPanelFragment.D2(megaSpeechRecognitionPanelFragment3, motionEvent, view)) {
                    return true;
                }
                d1a d1aVar3 = this.b;
                if (d1aVar3 != null) {
                    d1aVar3 = new gji(d1aVar3);
                }
                view.removeCallbacks((Runnable) d1aVar3);
                return true;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c implements SpeechRecognizer.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f2046a;
        public final /* synthetic */ MegaSpeechRecognitionPanelFragment b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ String b;

            public a(String str) {
                this.b = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                String str = this.b;
                if (str != null) {
                    if (str.length() <= 0) {
                        str = null;
                    }
                    if (str != null) {
                        if (MegaSpeechRecognitionPanelFragment.s2(c.this.b).getVisibility() != 8) {
                            MegaSpeechRecognitionPanelFragment.s2(c.this.b).setVisibility(8);
                        }
                        if (MegaSpeechRecognitionPanelFragment.A2(c.this.b).getVisibility() != 0) {
                            MegaSpeechRecognitionPanelFragment.A2(c.this.b).setVisibility(0);
                            if (MegaSpeechRecognitionPanelFragment.E2(c.this.b)) {
                                MegaSpeechRecognitionPanelFragment.u2(c.this.b).setTextColor(ContextCompat.getColor(c.this.f2046a, R.color.tb_text_inverse));
                            }
                        }
                        if (MegaSpeechRecognitionPanelFragment.E2(c.this.b)) {
                            MegaTextTypeView.setIncrementalText$default(MegaSpeechRecognitionPanelFragment.A2(c.this.b), str, 0L, 2, null);
                        }
                    }
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (MegaSpeechRecognitionPanelFragment.E2(c.this.b)) {
                    MegaSpeechRecognitionPanelFragment.p2(c.this.b);
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.alibaba.ability.impl.speechrecognition.panel.MegaSpeechRecognitionPanelFragment$c$c  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class RunnableC0053c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ int b;

            public RunnableC0053c(int i) {
                this.b = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!MegaSpeechRecognitionPanelFragment.E2(c.this.b)) {
                } else {
                    if (this.b == 0) {
                        MegaSpeechRecognitionPanelFragment.B2(c.this.b).onVoiceVolume(1);
                    } else {
                        MegaSpeechRecognitionPanelFragment.B2(c.this.b).onVoiceVolume(this.b);
                    }
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class d implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public d() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                MegaSpeechRecognitionPanelFragment.Q2(c.this.b);
                olq.a(c.this.b.getActivity(), ppl.SPEECH_RECOGNITION_POP_ID);
            }
        }

        public c(Context context, MegaSpeechRecognitionPanelFragment megaSpeechRecognitionPanelFragment) {
            this.f2046a = context;
            this.b = megaSpeechRecognitionPanelFragment;
        }

        @Override // com.alibaba.ability.impl.speechrecognition.nui.SpeechRecognizer.c
        public void b(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18b22937", new Object[]{this, str, new Boolean(z)});
            } else {
                ppl.INSTANCE.e(new a(str));
            }
        }

        @Override // com.alibaba.ability.impl.speechrecognition.nui.SpeechRecognizer.c
        public void onEnd() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efc72903", new Object[]{this});
            } else {
                ppl.INSTANCE.e(new b());
            }
        }

        @Override // com.alibaba.ability.impl.speechrecognition.nui.SpeechRecognizer.c
        public void onStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            }
        }

        @Override // com.alibaba.ability.impl.speechrecognition.nui.SpeechRecognizer.c
        public void onVoiceVolume(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b78c1fef", new Object[]{this, new Integer(i)});
            } else {
                ppl.INSTANCE.e(new RunnableC0053c(i));
            }
        }

        @Override // com.alibaba.ability.impl.speechrecognition.nui.SpeechRecognizer.c
        public void a(SpeechRecognizer.SpeechRecognizerError speechRecognizerError, String str) {
            ErrorResult errorResult;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98963c47", new Object[]{this, speechRecognizerError, str});
                return;
            }
            ckf.g(speechRecognizerError, "type");
            prd v2 = MegaSpeechRecognitionPanelFragment.v2(this.b);
            if (v2 != null) {
                int i = fji.$EnumSwitchMapping$0[speechRecognizerError.ordinal()];
                if (i == 1) {
                    errorResult = new ErrorResult("NO_MIC_PERMISSION", "Permission AUDIO Required", (Map) null, 4, (a07) null);
                } else if (i != 2) {
                    errorResult = new ErrorResult("TASK_EXCEPTION", "Voice Processing Task Error. Code: " + speechRecognizerError + ", Msg: " + str, (Map) null, 4, (a07) null);
                } else {
                    errorResult = new ErrorResult("CAN_NOT_GET_TOKEN", "Token Acquisition Failed", (Map) null, 4, (a07) null);
                }
                v2.O(errorResult);
            }
            ppl.INSTANCE.e(new d());
        }
    }
}
