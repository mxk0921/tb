package com.taobao.message.kit.core;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DelayInitContainer extends BaseContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private InitMethodCallback initMethodCallback;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface InitMethodCallback {
        <T> void doInitMethod(Class<T> cls);

        <T> void doInitMethod(Class<T> cls, String str, String str2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class SingletonHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static DelayInitContainer instance = new DelayInitContainer();

        static {
            t2o.a(529530941);
        }

        private SingletonHolder() {
        }

        public static /* synthetic */ DelayInitContainer access$000() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DelayInitContainer) ipChange.ipc$dispatch("10f0c2a4", new Object[0]);
            }
            return instance;
        }
    }

    static {
        t2o.a(529530939);
    }

    public static DelayInitContainer getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DelayInitContainer) ipChange.ipc$dispatch("158653a9", new Object[0]);
        }
        return (DelayInitContainer) SingletonHolder.access$000().getLazy();
    }

    public static /* synthetic */ Object ipc$super(DelayInitContainer delayInitContainer, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -366443726) {
            return super.get((Class) objArr[0]);
        }
        if (hashCode == 605395102) {
            return super.get((Class) objArr[0], (String) objArr[1], (String) objArr[2]);
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/message/kit/core/DelayInitContainer");
    }

    @Override // com.taobao.message.kit.core.BaseContainer
    public <T> T get(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("ea288332", new Object[]{this, cls});
        }
        InitMethodCallback initMethodCallback = this.initMethodCallback;
        if (initMethodCallback != null) {
            initMethodCallback.doInitMethod(cls);
        }
        return (T) super.get(cls);
    }

    public InitMethodCallback getInitMethodCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InitMethodCallback) ipChange.ipc$dispatch("9f61c134", new Object[]{this});
        }
        return this.initMethodCallback;
    }

    public <T> T getWithoutInit(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("f6f6ff9e", new Object[]{this, cls}) : (T) super.get(cls);
    }

    public void setInitMethodCallback(InitMethodCallback initMethodCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25b1872", new Object[]{this, initMethodCallback});
        } else {
            this.initMethodCallback = initMethodCallback;
        }
    }

    public <T> T getWithoutInit(Class<T> cls, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("f7234f0a", new Object[]{this, cls, str, str2}) : (T) super.get(cls, str, str2);
    }

    @Override // com.taobao.message.kit.core.BaseContainer
    public <T> T get(Class<T> cls, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("2415989e", new Object[]{this, cls, str, str2});
        }
        InitMethodCallback initMethodCallback = this.initMethodCallback;
        if (initMethodCallback != null) {
            initMethodCallback.doInitMethod(cls, str, str2);
        }
        return (T) super.get(cls, str, str2);
    }
}
