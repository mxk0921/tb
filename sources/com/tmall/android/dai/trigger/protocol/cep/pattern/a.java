package com.tmall.android.dai.trigger.protocol.cep.pattern;

import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.trigger.TriggerMatchResult;
import com.tmall.android.dai.trigger.protocol.cep.pattern.CepNative;
import java.util.ArrayList;
import java.util.Map;
import tb.cgu;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a implements cgu<Map<String, String>> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "CEP.TriggerPattern";
    public static final int USER_EVENT_RESULT_INVALID_EVENT = 1;
    public static final int USER_EVENT_RESULT_MATCHED = 0;
    public static final int USER_EVENT_RESULT_MATCH_FAILED = 3;
    public static final int USER_EVENT_RESULT_PARTIAL_MATCH = 2;

    /* renamed from: a  reason: collision with root package name */
    public final CepNative f14217a;

    static {
        t2o.a(1034944738);
        t2o.a(1034944727);
    }

    public a(CepNative cepNative) {
        this.f14217a = cepNative;
    }

    @Override // tb.cgu
    public ArrayList<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("a8bff31e", new Object[]{this});
        }
        return null;
    }

    public void d(CepNative.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7a8c0eb", new Object[]{this, aVar});
        } else {
            this.f14217a.setMatchSuccessCallback(aVar);
        }
    }

    /* renamed from: c */
    public TriggerMatchResult a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TriggerMatchResult) ipChange.ipc$dispatch("cb8c1c93", new Object[]{this, map});
        }
        int onUserEvent = this.f14217a.onUserEvent(map);
        if (onUserEvent == 0) {
            return TriggerMatchResult.c();
        }
        if (onUserEvent == 1) {
            TriggerMatchResult.TriggerMatchResultCode triggerMatchResultCode = TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_CEP_DEFINITION_NOT_MATCH;
            return TriggerMatchResult.b(triggerMatchResultCode, "cep invalid event : " + onUserEvent);
        } else if (onUserEvent == 2) {
            TriggerMatchResult.TriggerMatchResultCode triggerMatchResultCode2 = TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_CEP_IN_PROGRESS;
            return TriggerMatchResult.b(triggerMatchResultCode2, "cep partial match : " + onUserEvent);
        } else if (onUserEvent != 3) {
            return TriggerMatchResult.b(TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_CEP_INNER_NOT_MATCH, "undefined return code");
        } else {
            TriggerMatchResult.TriggerMatchResultCode triggerMatchResultCode3 = TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_CEP_INNER_NOT_MATCH;
            return TriggerMatchResult.b(triggerMatchResultCode3, "cep inner not match : " + onUserEvent);
        }
    }
}
