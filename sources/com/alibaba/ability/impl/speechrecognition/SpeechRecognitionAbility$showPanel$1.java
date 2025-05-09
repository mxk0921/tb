package com.alibaba.ability.impl.speechrecognition;

import android.content.Context;
import android.os.Bundle;
import com.alibaba.ability.impl.speechrecognition.panel.MegaSpeechRecognitionPanelFragment;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.a07;
import tb.ckf;
import tb.e9;
import tb.g1a;
import tb.h9;
import tb.hij;
import tb.ibq;
import tb.olq;
import tb.ppl;
import tb.prd;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class SpeechRecognitionAbility$showPanel$1 extends Lambda implements g1a<Boolean, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $bizID;
    public final /* synthetic */ prd $callback;
    public final /* synthetic */ Ref$ObjectRef $ctx;
    public final /* synthetic */ ibq $params;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpeechRecognitionAbility$showPanel$1(Ref$ObjectRef ref$ObjectRef, String str, ibq ibqVar, prd prdVar) {
        super(1);
        this.$ctx = ref$ObjectRef;
        this.$bizID = str;
        this.$params = ibqVar;
        this.$callback = prdVar;
    }

    public static /* synthetic */ Object ipc$super(SpeechRecognitionAbility$showPanel$1 speechRecognitionAbility$showPanel$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/speechrecognition/SpeechRecognitionAbility$showPanel$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return xhv.INSTANCE;
    }

    public final void invoke(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b985b5", new Object[]{this, new Boolean(z)});
        } else if (z) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "maxWidth", (String) 1);
            jSONObject.put((JSONObject) "panEnable", (String) Boolean.FALSE);
            Boolean bool = Boolean.TRUE;
            jSONObject.put((JSONObject) "autoRotate", (String) bool);
            jSONObject.put((JSONObject) e9.TAK_ABILITY_MATCH_CONTENT, (String) bool);
            jSONObject.put((JSONObject) hij.KEY_CORNER_RADIUS, (String) 4);
            MegaSpeechRecognitionPanelFragment megaSpeechRecognitionPanelFragment = new MegaSpeechRecognitionPanelFragment();
            Bundle bundle = new Bundle();
            bundle.putString("bizID", this.$bizID);
            bundle.putString("vocabularyID", this.$params.f21216a);
            bundle.putBoolean("punctuation", true);
            bundle.putInt("maxEndSilence", 60000);
            bundle.putBoolean("voiceDetection", false);
            xhv xhvVar = xhv.INSTANCE;
            megaSpeechRecognitionPanelFragment.setArguments(bundle);
            megaSpeechRecognitionPanelFragment.j3(this.$callback);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put((JSONObject) h9.KEY_POP_CONFIG, (String) jSONObject);
            jSONObject2.put((JSONObject) "popId", ppl.SPEECH_RECOGNITION_POP_ID);
            ckf.f(olq.g((Context) this.$ctx.element, megaSpeechRecognitionPanelFragment, jSONObject2, null), "StdPopFacade.showFragmen…                    null)");
        } else {
            this.$callback.O(new ErrorResult("NO_MIC_PERMISSION", "Permission AUDIO Required", (Map) null, 4, (a07) null));
        }
    }
}
