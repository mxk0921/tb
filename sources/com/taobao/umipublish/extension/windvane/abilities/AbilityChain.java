package com.taobao.umipublish.extension.windvane.abilities;

import android.content.Context;
import android.os.SystemClock;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.extension.windvane.abilities.BaseAbility;
import com.taobao.umipublish.monitor.PerformanceMonitor;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class AbilityChain extends BaseAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String loadingText;
    private boolean mCanceled;
    private final BaseAbility mCurrent;
    private InputAndOutputHandler mInputAndOutputHandler;
    private String mName;
    private AbilityChain mNext;
    private int mProgress = 0;
    private float mWeight = 1.0f;
    private boolean mFinished = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class InputAndOutputHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(944767141);
        }

        public JSONObject a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("52e6f464", new Object[]{this, jSONObject});
            }
            return jSONObject;
        }

        public boolean b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ce95a278", new Object[]{this, jSONObject})).booleanValue();
            }
            return false;
        }

        public void c(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("def50cbb", new Object[]{this, jSONObject});
            }
        }
    }

    static {
        t2o.a(944767139);
    }

    public AbilityChain(BaseAbility baseAbility, Context context) {
        this.mCurrent = baseAbility;
        baseAbility.setContext(context);
        setContext(context);
    }

    public static /* synthetic */ int access$000(AbilityChain abilityChain) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("496c3688", new Object[]{abilityChain})).intValue();
        }
        return abilityChain.mProgress;
    }

    public static /* synthetic */ float access$100(AbilityChain abilityChain) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cbb6eb64", new Object[]{abilityChain})).floatValue();
        }
        return abilityChain.mWeight;
    }

    public static /* synthetic */ boolean access$200(AbilityChain abilityChain) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e01a057", new Object[]{abilityChain})).booleanValue();
        }
        return abilityChain.mCanceled;
    }

    public static /* synthetic */ InputAndOutputHandler access$300(AbilityChain abilityChain) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputAndOutputHandler) ipChange.ipc$dispatch("79b215b6", new Object[]{abilityChain});
        }
        return abilityChain.mInputAndOutputHandler;
    }

    public static /* synthetic */ BaseAbility access$400(AbilityChain abilityChain) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseAbility) ipChange.ipc$dispatch("3e4a9c19", new Object[]{abilityChain});
        }
        return abilityChain.mCurrent;
    }

    public static /* synthetic */ boolean access$502(AbilityChain abilityChain, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8dae386a", new Object[]{abilityChain, new Boolean(z)})).booleanValue();
        }
        abilityChain.mFinished = z;
        return z;
    }

    public static /* synthetic */ AbilityChain access$600(AbilityChain abilityChain) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbilityChain) ipChange.ipc$dispatch("1b0fae2b", new Object[]{abilityChain});
        }
        return abilityChain.mNext;
    }

    public static /* synthetic */ void access$700(AbilityChain abilityChain, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("556e6015", new Object[]{abilityChain, new Integer(i)});
        } else {
            abilityChain.setProgress(i);
        }
    }

    public static /* synthetic */ Object ipc$super(AbilityChain abilityChain, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/abilities/AbilityChain");
    }

    private void setProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf0340d", new Object[]{this, new Integer(i)});
        } else {
            this.mProgress = i;
        }
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        this.mCanceled = true;
        AbilityChain abilityChain = this.mNext;
        if (abilityChain != null) {
            abilityChain.cancel();
        }
    }

    public AbilityChain getActiveChain() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbilityChain) ipChange.ipc$dispatch("168bde88", new Object[]{this});
        }
        if (!this.mFinished) {
            return this;
        }
        AbilityChain abilityChain = this.mNext;
        if (abilityChain != null) {
            return abilityChain.getActiveChain();
        }
        return null;
    }

    public String getLoadingText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ccfead86", new Object[]{this});
        }
        return this.loadingText;
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.mName;
    }

    public AbilityChain inputAndOutputHandler(InputAndOutputHandler inputAndOutputHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbilityChain) ipChange.ipc$dispatch("51d14ead", new Object[]{this, inputAndOutputHandler});
        }
        this.mInputAndOutputHandler = inputAndOutputHandler;
        return this;
    }

    public AbilityChain loadingText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbilityChain) ipChange.ipc$dispatch("1be03cb6", new Object[]{this, str});
        }
        this.loadingText = str;
        return this;
    }

    public AbilityChain name(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbilityChain) ipChange.ipc$dispatch("fe29bd38", new Object[]{this, str});
        }
        this.mName = str;
        return this;
    }

    public AbilityChain next(AbilityChain abilityChain) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbilityChain) ipChange.ipc$dispatch("5367eace", new Object[]{this, abilityChain});
        }
        this.mNext = abilityChain;
        return abilityChain;
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility
    public void onExecute(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95fd7073", new Object[]{this, jSONObject});
            return;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.mCurrent.setListener(new BaseAbility.Listener() { // from class: com.taobao.umipublish.extension.windvane.abilities.AbilityChain.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("eb8b0117", new Object[]{this, str, str2});
                } else {
                    AbilityChain.this.errorCallback(str, str2);
                }
            }

            @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
            public void onProgress(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5ec8f5b0", new Object[]{this, new Integer(i)});
                    return;
                }
                AbilityChain abilityChain = AbilityChain.this;
                abilityChain.progressCallback(AbilityChain.access$000(abilityChain) + ((int) (i * AbilityChain.access$100(AbilityChain.this))));
            }

            @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
            public void onSuccess(JSONObject jSONObject2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("980108a5", new Object[]{this, jSONObject2});
                    return;
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                PerformanceMonitor n = PerformanceMonitor.n();
                n.l("AbilityChain", "AbilityChain_" + AbilityChain.this.getName(), elapsedRealtime2);
                if (!AbilityChain.access$200(AbilityChain.this)) {
                    if (AbilityChain.access$300(AbilityChain.this) != null) {
                        AbilityChain.access$300(AbilityChain.this).c(jSONObject2);
                    }
                    if (AbilityChain.access$300(AbilityChain.this) == null || !AbilityChain.access$300(AbilityChain.this).b(jSONObject2)) {
                        AbilityChain.access$502(AbilityChain.this, true);
                        if (AbilityChain.access$600(AbilityChain.this) != null) {
                            AbilityChain.access$600(AbilityChain.this).setListener(AbilityChain.this.mListener);
                            AbilityChain.access$700(AbilityChain.access$600(AbilityChain.this), (int) ((AbilityChain.access$100(AbilityChain.this) * 100.0f) + AbilityChain.access$000(AbilityChain.this)));
                            AbilityChain.access$600(AbilityChain.this).execute(jSONObject2);
                            return;
                        }
                        AbilityChain.this.successCallback(jSONObject2);
                        return;
                    }
                    AbilityChain abilityChain = AbilityChain.this;
                    abilityChain.errorCallback("ChainBreak_" + AbilityChain.this.getName(), "ChainBreak_".concat(AbilityChain.access$400(AbilityChain.this).getClass().getSimpleName()));
                }
            }
        });
        BaseAbility baseAbility = this.mCurrent;
        InputAndOutputHandler inputAndOutputHandler = this.mInputAndOutputHandler;
        if (inputAndOutputHandler != null) {
            jSONObject = inputAndOutputHandler.a(jSONObject);
        }
        baseAbility.execute(jSONObject);
    }

    public AbilityChain weight(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbilityChain) ipChange.ipc$dispatch("dbbca6fd", new Object[]{this, new Float(f)});
        }
        this.mWeight = f;
        return this;
    }
}
