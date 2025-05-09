package com.taobao.message.kit.core;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class GlobalContainer extends BaseContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "GlobalContainer";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class SingletonHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static GlobalContainer instance = new GlobalContainer();

        static {
            t2o.a(529530943);
        }

        private SingletonHolder() {
        }

        public static /* synthetic */ GlobalContainer access$000() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (GlobalContainer) ipChange.ipc$dispatch("285aea06", new Object[0]);
            }
            return instance;
        }
    }

    static {
        t2o.a(529530942);
    }

    public static GlobalContainer getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GlobalContainer) ipChange.ipc$dispatch("ca4d7f21", new Object[0]);
        }
        return (GlobalContainer) SingletonHolder.access$000().getLazy();
    }

    public static /* synthetic */ Object ipc$super(GlobalContainer globalContainer, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -366443726) {
            return super.get((Class) objArr[0]);
        }
        if (hashCode == 605395102) {
            return super.get((Class) objArr[0], (String) objArr[1], (String) objArr[2]);
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/message/kit/core/GlobalContainer");
    }

    @Override // com.taobao.message.kit.core.BaseContainer
    public <T> T get(Class<T> cls, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("2415989e", new Object[]{this, cls, str, str2});
        }
        T t = (T) super.get(cls, str, str2);
        return t == null ? (T) DelayInitContainer.getInstance().get(cls, str, str2) : t;
    }

    @Override // com.taobao.message.kit.core.BaseContainer
    public <T> T get(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("ea288332", new Object[]{this, cls});
        }
        T t = (T) super.get(cls);
        return t == null ? (T) DelayInitContainer.getInstance().get(cls) : t;
    }
}
