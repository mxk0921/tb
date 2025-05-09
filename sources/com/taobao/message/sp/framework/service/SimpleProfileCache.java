package com.taobao.message.sp.framework.service;

import com.alipay.android.phone.iifaa.did.rpc.model.CredentialRpcData;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.sp.framework.model.SimpleProfile;
import com.taobao.message.sp.framework.model.SimpleTarget;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJC\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0016\u001a\u00020\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018¢\u0006\u0004\b\u0016\u0010\u001aR \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/taobao/message/sp/framework/service/SimpleProfileCache;", "", "<init>", "()V", "", "targetId", "Lcom/taobao/message/sp/framework/model/SimpleProfile;", "get", "(Ljava/lang/String;)Lcom/taobao/message/sp/framework/model/SimpleProfile;", "nick", "getByNick", "", "isNick", "identifier", "channelType", "bizType", "Lcom/taobao/message/kit/core/IObserver;", "observer", "Ltb/xhv;", CredentialRpcData.ACTION_FETCH, "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/taobao/message/kit/core/IObserver;)V", AdvanceSetting.NETWORK_TYPE, "add", "(Lcom/taobao/message/sp/framework/model/SimpleProfile;)V", "", "list", "(Ljava/util/List;)V", "", "cache", "Ljava/util/Map;", "cacheByNick", "message_sp_framework_debug"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class SimpleProfileCache {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final SimpleProfileCache INSTANCE = new SimpleProfileCache();
    private static final Map<String, SimpleProfile> cache = new LinkedHashMap();
    private static final Map<String, SimpleProfile> cacheByNick = new LinkedHashMap();

    static {
        t2o.a(552599711);
    }

    private SimpleProfileCache() {
    }

    public final void add(SimpleProfile simpleProfile) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94488f70", new Object[]{this, simpleProfile});
            return;
        }
        ckf.h(simpleProfile, AdvanceSetting.NETWORK_TYPE);
        SimpleTarget target = simpleProfile.getTarget();
        ckf.c(target, "it.target");
        String targetId = target.getTargetId();
        if (targetId != null) {
            cache.put(targetId, simpleProfile);
        }
        String nick = simpleProfile.getNick();
        if (nick != null) {
            cacheByNick.put(nick, simpleProfile);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void fetch(String str, boolean z, String str2, String str3, String str4, final IObserver<SimpleProfile> iObserver) {
        Map<String, SimpleProfile> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb758117", new Object[]{this, str, new Boolean(z), str2, str3, str4, iObserver});
            return;
        }
        ckf.h(str, "targetId");
        ckf.h(str2, "identifier");
        ckf.h(str3, "channelType");
        ckf.h(str4, "bizType");
        ckf.h(iObserver, "observer");
        if (z) {
            map = cacheByNick;
        } else {
            map = cache;
        }
        SimpleProfile simpleProfile = map.get(str);
        if (simpleProfile != null) {
            iObserver.onNext(simpleProfile);
            iObserver.onComplete();
        } else if (z) {
            ISimpleDataService obtain = SimpleServiceFactory.obtain(str2, str3, ISimpleProfileService.class);
            if (obtain != null) {
                List singletonList = Collections.singletonList(str);
                ckf.c(singletonList, "Collections.singletonList(targetId)");
                ((ISimpleProfileService) obtain).listProfilesByNick(singletonList, str4, new IObserver<List<? extends SimpleProfile>>() { // from class: com.taobao.message.sp.framework.service.SimpleProfileCache$fetch$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.message.kit.core.IObserver
                    public void onComplete() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                        } else {
                            IObserver.this.onComplete();
                        }
                    }

                    @Override // com.taobao.message.kit.core.IObserver
                    public void onError(Throwable th) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, th});
                            return;
                        }
                        ckf.h(th, "p0");
                        IObserver.this.onError(th);
                    }

                    public void onNext(List<? extends SimpleProfile> list) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6d15fbea", new Object[]{this, list});
                            return;
                        }
                        ckf.h(list, "p0");
                        SimpleProfile simpleProfile2 = (SimpleProfile) list.get(0);
                        SimpleProfileCache.INSTANCE.add(simpleProfile2);
                        IObserver.this.onNext(simpleProfile2);
                    }
                });
                return;
            }
            ckf.s();
            throw null;
        } else {
            ISimpleDataService obtain2 = SimpleServiceFactory.obtain(str2, str3, ISimpleProfileService.class);
            if (obtain2 != null) {
                List singletonList2 = Collections.singletonList(str);
                ckf.c(singletonList2, "Collections.singletonList(targetId)");
                ((ISimpleProfileService) obtain2).listProfiles(singletonList2, str4, new IObserver<List<? extends SimpleProfile>>() { // from class: com.taobao.message.sp.framework.service.SimpleProfileCache$fetch$2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.message.kit.core.IObserver
                    public void onComplete() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                        } else {
                            IObserver.this.onComplete();
                        }
                    }

                    @Override // com.taobao.message.kit.core.IObserver
                    public void onError(Throwable th) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, th});
                            return;
                        }
                        ckf.h(th, "p0");
                        IObserver.this.onError(th);
                    }

                    public void onNext(List<? extends SimpleProfile> list) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6d15fbea", new Object[]{this, list});
                            return;
                        }
                        ckf.h(list, "p0");
                        SimpleProfile simpleProfile2 = (SimpleProfile) list.get(0);
                        SimpleProfileCache.INSTANCE.add(simpleProfile2);
                        IObserver.this.onNext(simpleProfile2);
                    }
                });
                return;
            }
            ckf.s();
            throw null;
        }
    }

    public final SimpleProfile get(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleProfile) ipChange.ipc$dispatch("7b0444af", new Object[]{this, str});
        }
        ckf.h(str, "targetId");
        return cache.get(str);
    }

    public final SimpleProfile getByNick(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleProfile) ipChange.ipc$dispatch("e69bec29", new Object[]{this, str});
        }
        ckf.h(str, "nick");
        return cacheByNick.get(str);
    }

    public final void add(List<? extends SimpleProfile> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95d80199", new Object[]{this, list});
            return;
        }
        ckf.h(list, "list");
        for (SimpleProfile simpleProfile : list) {
            INSTANCE.add(simpleProfile);
        }
    }
}
