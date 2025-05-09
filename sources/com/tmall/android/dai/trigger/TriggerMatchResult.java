package com.tmall.android.dai.trigger;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TriggerMatchResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f14216a;
    public final TriggerMatchResultCode b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum TriggerMatchResultCode {
        TRIGGER_MATCH_RESULT_CODE_SUCCESS,
        TRIGGER_MATCH_RESULT_CODE_UT_OWNER_NOT_MATCH,
        TRIGGER_MATCH_RESULT_CODE_UT_EVENT_ID_NOT_MATCH,
        TRIGGER_MATCH_RESULT_CODE_UT_PAGE_NOT_MATCH,
        TRIGGER_MATCH_RESULT_CODE_UT_ARG1_NOT_MATCH,
        TRIGGER_MATCH_RESULT_CODE_UT_ARG2_NOT_MATCH,
        TRIGGER_MATCH_RESULT_CODE_UT_ARG3_NOT_MATCH,
        TRIGGER_MATCH_RESULT_CODE_UT_ARGS_NOT_MATCH,
        TRIGGER_MATCH_RESULT_CODE_UT_BATCH_NOT_MATCH,
        TRIGGER_MATCH_RESULT_CODE_CEP_DEFINITION_NOT_MATCH,
        TRIGGER_MATCH_RESULT_CODE_CEP_IN_PROGRESS,
        TRIGGER_MATCH_RESULT_CODE_CEP_INNER_NOT_MATCH;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(TriggerMatchResultCode triggerMatchResultCode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tmall/android/dai/trigger/TriggerMatchResult$TriggerMatchResultCode");
        }

        public static TriggerMatchResultCode valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TriggerMatchResultCode) ipChange.ipc$dispatch("d4ca0608", new Object[]{str});
            }
            return (TriggerMatchResultCode) Enum.valueOf(TriggerMatchResultCode.class, str);
        }
    }

    static {
        t2o.a(1034944725);
    }

    public TriggerMatchResult(boolean z, TriggerMatchResultCode triggerMatchResultCode, String str) {
        this.f14216a = z;
        this.b = triggerMatchResultCode;
    }

    public static TriggerMatchResult b(TriggerMatchResultCode triggerMatchResultCode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TriggerMatchResult) ipChange.ipc$dispatch("532db835", new Object[]{triggerMatchResultCode, str});
        }
        return new TriggerMatchResult(false, triggerMatchResultCode, str);
    }

    public static TriggerMatchResult c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TriggerMatchResult) ipChange.ipc$dispatch("ab40d8f0", new Object[0]);
        }
        return new TriggerMatchResult(true, TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_SUCCESS, null);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e748204d", new Object[]{this})).booleanValue();
        }
        return Arrays.asList(TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_ARG1_NOT_MATCH, TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_ARG2_NOT_MATCH, TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_ARG3_NOT_MATCH, TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_ARGS_NOT_MATCH).contains(this.b);
    }
}
