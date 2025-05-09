package com.taobao.message.sp.framework.service;

import com.alipay.android.phone.iifaa.did.rpc.model.CredentialRpcData;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.sp.framework.model.SimpleConversation;
import com.taobao.message.sp.framework.model.SimpleConversationIdentifier;
import com.taobao.message.sp.framework.model.SimpleTarget;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u00062\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0013J=\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ=\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u0019¢\u0006\u0004\b\u001d\u0010\u001cR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/taobao/message/sp/framework/service/SimpleConversationCache;", "", "<init>", "()V", "", "nick", "Ltb/xhv;", "markCreated", "(Ljava/lang/String;)V", "", "isCreated", "(Ljava/lang/String;)Z", "", "Lcom/taobao/message/sp/framework/model/SimpleConversation;", "list", "addData", "(Ljava/util/List;)V", "conversationCode", "get", "(Ljava/lang/String;)Lcom/taobao/message/sp/framework/model/SimpleConversation;", "targetId", "getByTargetId", "channelType", "identifier", "forceRefresh", "Lcom/taobao/message/kit/core/IObserver;", "observer", CredentialRpcData.ACTION_FETCH, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/taobao/message/kit/core/IObserver;)V", "fetchByTargetId", "", "cache", "Ljava/util/Map;", "cacheByTargetId", "", "createdNick", "Ljava/util/Set;", "message_sp_framework_debug"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class SimpleConversationCache {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final SimpleConversationCache INSTANCE = new SimpleConversationCache();
    private static final Map<String, SimpleConversation> cache = new LinkedHashMap();
    private static final Map<String, SimpleConversation> cacheByTargetId = new LinkedHashMap();
    private static final Set<String> createdNick = new LinkedHashSet();

    static {
        t2o.a(552599707);
    }

    private SimpleConversationCache() {
    }

    public static /* synthetic */ void fetch$default(SimpleConversationCache simpleConversationCache, String str, String str2, String str3, boolean z, IObserver iObserver, int i, Object obj) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3277eff", new Object[]{simpleConversationCache, str, str2, str3, new Boolean(z), iObserver, new Integer(i), obj});
            return;
        }
        if ((i & 8) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        simpleConversationCache.fetch(str, str2, str3, z2, iObserver);
    }

    public static /* synthetic */ void fetchByTargetId$default(SimpleConversationCache simpleConversationCache, String str, String str2, String str3, boolean z, IObserver iObserver, int i, Object obj) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beb00362", new Object[]{simpleConversationCache, str, str2, str3, new Boolean(z), iObserver, new Integer(i), obj});
            return;
        }
        if ((i & 8) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        simpleConversationCache.fetchByTargetId(str, str2, str3, z2, iObserver);
    }

    public final void addData(List<? extends SimpleConversation> list) {
        String targetId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc4ca3e3", new Object[]{this, list});
        } else if (list != null) {
            for (SimpleConversation simpleConversation : list) {
                Map<String, SimpleConversation> map = cache;
                String conversationCode = simpleConversation.getConversationCode();
                ckf.c(conversationCode, "it.conversationCode");
                map.put(conversationCode, simpleConversation);
                SimpleConversationIdentifier conversationIdentifier = simpleConversation.getConversationIdentifier();
                ckf.c(conversationIdentifier, "it.conversationIdentifier");
                SimpleTarget target = conversationIdentifier.getTarget();
                if (!(target == null || (targetId = target.getTargetId()) == null)) {
                    cacheByTargetId.put(targetId, simpleConversation);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void fetch(final String str, String str2, String str3, boolean z, final IObserver<SimpleConversation> iObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fbce789", new Object[]{this, str, str2, str3, new Boolean(z), iObserver});
            return;
        }
        ckf.h(str, "conversationCode");
        ckf.h(str2, "channelType");
        ckf.h(str3, "identifier");
        ckf.h(iObserver, "observer");
        SimpleConversation simpleConversation = get(str);
        if (simpleConversation != null) {
            iObserver.onNext(simpleConversation);
            iObserver.onComplete();
        } else if (z || cache.isEmpty()) {
            ISimpleConversationService iSimpleConversationService = (ISimpleConversationService) SimpleServiceFactory.obtain(str3, str2, ISimpleConversationService.class);
            if (iSimpleConversationService != 0) {
                iSimpleConversationService.listConversations(200, new IObserver<List<? extends SimpleConversation>>() { // from class: com.taobao.message.sp.framework.service.SimpleConversationCache$fetch$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.message.kit.core.IObserver
                    public void onComplete() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                            return;
                        }
                        SimpleConversation simpleConversation2 = SimpleConversationCache.INSTANCE.get(str);
                        if (simpleConversation2 != null) {
                            iObserver.onNext(simpleConversation2);
                            iObserver.onComplete();
                            return;
                        }
                        iObserver.onError(new RuntimeException("no data!"));
                    }

                    @Override // com.taobao.message.kit.core.IObserver
                    public void onError(Throwable th) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, th});
                            return;
                        }
                        ckf.h(th, "p0");
                        iObserver.onError(th);
                    }

                    public void onNext(List<? extends SimpleConversation> list) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6d15fbea", new Object[]{this, list});
                        } else {
                            ckf.h(list, "p0");
                        }
                    }
                });
            }
        } else {
            iObserver.onError(new RuntimeException("no data!"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void fetchByTargetId(final String str, String str2, String str3, boolean z, final IObserver<SimpleConversation> iObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dcb666c", new Object[]{this, str, str2, str3, new Boolean(z), iObserver});
            return;
        }
        ckf.h(str, "targetId");
        ckf.h(str2, "channelType");
        ckf.h(str3, "identifier");
        ckf.h(iObserver, "observer");
        SimpleConversation byTargetId = getByTargetId(str);
        if (byTargetId != null) {
            iObserver.onNext(byTargetId);
            iObserver.onComplete();
        } else if (z || cacheByTargetId.isEmpty()) {
            ISimpleConversationService iSimpleConversationService = (ISimpleConversationService) SimpleServiceFactory.obtain(str3, str2, ISimpleConversationService.class);
            if (iSimpleConversationService != 0) {
                iSimpleConversationService.listConversations(200, new IObserver<List<? extends SimpleConversation>>() { // from class: com.taobao.message.sp.framework.service.SimpleConversationCache$fetchByTargetId$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.message.kit.core.IObserver
                    public void onComplete() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                            return;
                        }
                        SimpleConversation byTargetId2 = SimpleConversationCache.INSTANCE.getByTargetId(str);
                        if (byTargetId2 != null) {
                            iObserver.onNext(byTargetId2);
                            iObserver.onComplete();
                            return;
                        }
                        iObserver.onError(new RuntimeException("no data!"));
                    }

                    @Override // com.taobao.message.kit.core.IObserver
                    public void onError(Throwable th) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, th});
                            return;
                        }
                        ckf.h(th, "p0");
                        iObserver.onError(new RuntimeException("no data!"));
                    }

                    public void onNext(List<? extends SimpleConversation> list) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6d15fbea", new Object[]{this, list});
                        } else {
                            ckf.h(list, "p0");
                        }
                    }
                });
            }
        } else {
            iObserver.onError(new RuntimeException("no data!"));
        }
    }

    public final SimpleConversation get(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleConversation) ipChange.ipc$dispatch("c1d5313b", new Object[]{this, str});
        }
        ckf.h(str, "conversationCode");
        return cache.get(str);
    }

    public final SimpleConversation getByTargetId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleConversation) ipChange.ipc$dispatch("f29e238", new Object[]{this, str});
        }
        ckf.h(str, "targetId");
        return cacheByTargetId.get(str);
    }

    public final boolean isCreated(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6318c673", new Object[]{this, str})).booleanValue();
        }
        ckf.h(str, "nick");
        return createdNick.contains(str);
    }

    public final void markCreated(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4905b3ac", new Object[]{this, str});
            return;
        }
        ckf.h(str, "nick");
        createdNick.add(str);
    }
}
