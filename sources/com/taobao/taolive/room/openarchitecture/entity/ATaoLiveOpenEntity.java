package com.taobao.taolive.room.openarchitecture.entity;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.ezd;
import tb.jbt;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class ATaoLiveOpenEntity extends ATaoliveOpenLiveRoomEntity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String bizCode;
    public String identifer;
    public String kmpIdentifier;
    public Object params;
    public jbt taoliveOpenContext;
    public WeakReference<ezd> taoliveServicesWeakReference;

    static {
        t2o.a(806355718);
    }

    public static /* synthetic */ Object ipc$super(ATaoLiveOpenEntity aTaoLiveOpenEntity, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/openarchitecture/entity/ATaoLiveOpenEntity");
    }

    public void setTaoliveOpenService(WeakReference<ezd> weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80e7c6b8", new Object[]{this, weakReference});
        } else {
            this.taoliveServicesWeakReference = weakReference;
        }
    }
}
