package com.taobao.message.sp.category.source;

import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.chat.compat.tree.MergeData;
import com.taobao.message.chat.compat.tree.TreeQueryResult;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner2.Command;
import com.taobao.message.lab.comfrm.inner2.Source;
import com.taobao.message.lab.comfrm.support.UserIdentifier;
import com.taobao.message.sp.framework.model.SimpleConversation;
import com.taobao.message.sp.framework.service.ISimpleConversationService;
import com.taobao.message.sp.framework.service.SimpleServiceFactory;
import com.taobao.message.tree.core.model.SimpleConversationContentNode;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0005J3\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0017\u001a\u00020\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001f\u0010 R$\u0010!\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010 ¨\u0006&"}, d2 = {"Lcom/taobao/message/sp/category/source/SimpleConversationListSource;", "Lcom/taobao/message/lab/comfrm/inner2/Source;", "Lcom/taobao/message/chat/compat/tree/TreeQueryResult;", "Lcom/taobao/message/lab/comfrm/support/UserIdentifier;", "<init>", "()V", "Lcom/taobao/message/lab/comfrm/core/ActionDispatcher;", "actionDispatcher", "Ltb/xhv;", "subscribe", "(Lcom/taobao/message/lab/comfrm/core/ActionDispatcher;)V", ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX, "Lcom/taobao/message/lab/comfrm/inner2/Command;", "command", "", "", "", "map", "use", "(Lcom/taobao/message/lab/comfrm/inner2/Command;Ljava/util/Map;Lcom/taobao/message/lab/comfrm/core/ActionDispatcher;)V", "", "Lcom/taobao/message/sp/framework/model/SimpleConversation;", "finalData", "onData", "(Ljava/util/List;Lcom/taobao/message/lab/comfrm/core/ActionDispatcher;)Lcom/taobao/message/chat/compat/tree/TreeQueryResult;", "Lcom/taobao/message/lab/comfrm/core/Action;", "action", "treeQueryResult", "updateOriginalData", "(Lcom/taobao/message/lab/comfrm/core/Action;Lcom/taobao/message/chat/compat/tree/TreeQueryResult;)Lcom/taobao/message/chat/compat/tree/TreeQueryResult;", "s", "identifier", "(Ljava/lang/String;)V", "mIdentifier", "Ljava/lang/String;", "getMIdentifier", "()Ljava/lang/String;", "setMIdentifier", "message_sp_category_debug"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class SimpleConversationListSource implements Source<TreeQueryResult>, UserIdentifier {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String mIdentifier;

    static {
        t2o.a(550502415);
        t2o.a(537919645);
        t2o.a(537919771);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        }
    }

    public final String getMIdentifier() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22571b39", new Object[]{this});
        }
        return this.mIdentifier;
    }

    @Override // com.taobao.message.lab.comfrm.support.UserIdentifier
    public void identifier(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee19127a", new Object[]{this, str});
            return;
        }
        ckf.h(str, "s");
        this.mIdentifier = str;
    }

    public final TreeQueryResult onData(List<SimpleConversation> list, ActionDispatcher actionDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TreeQueryResult) ipChange.ipc$dispatch("2d9e0f4f", new Object[]{this, list, actionDispatcher});
        }
        ckf.h(list, "finalData");
        ckf.h(actionDispatcher, "actionDispatcher");
        TreeQueryResult treeQueryResult = new TreeQueryResult();
        treeQueryResult.mergedData = new MergeData();
        treeQueryResult.list = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Map<String, ?>> map = treeQueryResult.mergedData.originalDataPool;
        ckf.c(map, "result.mergedData.originalDataPool");
        map.put("conversation", linkedHashMap);
        for (SimpleConversation simpleConversation : list) {
            if (!linkedHashMap.containsKey(simpleConversation.getConversationCode())) {
                String conversationCode = simpleConversation.getConversationCode();
                ckf.c(conversationCode, "it.conversationCode");
                linkedHashMap.put(conversationCode, simpleConversation);
                treeQueryResult.list.add(new SimpleConversationContentNode(simpleConversation));
            }
        }
        actionDispatcher.dispatch(new Action.Build(StdActions.UPDATE_ORIGINAL_DATA).data(treeQueryResult).build());
        return treeQueryResult;
    }

    public final void setMIdentifier(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40437ac5", new Object[]{this, str});
        } else {
            this.mIdentifier = str;
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void subscribe(ActionDispatcher actionDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c519475", new Object[]{this, actionDispatcher});
        } else {
            ckf.h(actionDispatcher, "actionDispatcher");
        }
    }

    public TreeQueryResult updateOriginalData(Action action, TreeQueryResult treeQueryResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TreeQueryResult) ipChange.ipc$dispatch("ed257f42", new Object[]{this, action, treeQueryResult});
        }
        ckf.h(action, "action");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.util.ArrayList] */
    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void use(Command command, Map<String, ? extends Object> map, final ActionDispatcher actionDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1c59d34", new Object[]{this, command, map, actionDispatcher});
            return;
        }
        ckf.h(command, "command");
        ckf.h(map, "map");
        ckf.h(actionDispatcher, "actionDispatcher");
        String str = this.mIdentifier;
        if (str != null) {
            ISimpleConversationService iSimpleConversationService = (ISimpleConversationService) SimpleServiceFactory.obtain(str, "all", ISimpleConversationService.class);
            if (iSimpleConversationService != 0) {
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ref$ObjectRef.element = new ArrayList();
                iSimpleConversationService.listConversations(40, new IObserver<List<? extends SimpleConversation>>() { // from class: com.taobao.message.sp.category.source.SimpleConversationListSource$use$$inlined$let$lambda$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.message.kit.core.IObserver
                    public void onComplete() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                        }
                    }

                    @Override // com.taobao.message.kit.core.IObserver
                    public void onError(Throwable th) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, th});
                        } else {
                            ckf.h(th, "p0");
                        }
                    }

                    public void onNext(List<? extends SimpleConversation> list) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6d15fbea", new Object[]{this, list});
                            return;
                        }
                        ckf.h(list, "data");
                        ((List) Ref$ObjectRef.this.element).addAll(list);
                        this.onData((List) Ref$ObjectRef.this.element, actionDispatcher);
                    }
                });
                return;
            }
            return;
        }
        ckf.s();
        throw null;
    }
}
