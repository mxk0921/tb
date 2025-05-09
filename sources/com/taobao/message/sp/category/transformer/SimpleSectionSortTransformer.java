package com.taobao.message.sp.category.transformer;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.chat.compat.tree.TreeQueryResult;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.inner2.SharedState;
import com.taobao.message.lab.comfrm.inner2.Transformer;
import com.taobao.message.sp.framework.model.SimpleConversation;
import com.taobao.message.tree.core.SortHelper;
import com.taobao.message.tree.core.model.ContentNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SimpleSectionSortTransformer implements Transformer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class NodeComparator implements Comparator<ContentNode> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Map<String, SimpleConversation> conversationPool;

        static {
            t2o.a(550502420);
        }

        public NodeComparator(Map<String, SimpleConversation> map) {
            this.conversationPool = map;
        }

        private long getSortKey(ContentNode contentNode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5e91e75a", new Object[]{this, contentNode})).longValue();
            }
            if ("conversation".equals(contentNode.getOriginalObjectType())) {
                SimpleConversation simpleConversation = this.conversationPool.get(contentNode.getOriginalObjectId());
                return Math.max(simpleConversation.getConversationContent().getLastMessageSummary().getSendTime(), simpleConversation.getOrderTime());
            } else if ("folder".equals(contentNode.getOriginalObjectType())) {
                return ValueUtil.getLong(contentNode.getComputedData(), "sortKey");
            } else {
                return 0L;
            }
        }

        private int getSortPriority(ContentNode contentNode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9571e306", new Object[]{this, contentNode})).intValue();
            }
            if ("conversation".equals(contentNode.getOriginalObjectType())) {
                return this.conversationPool.get(contentNode.getOriginalObjectId()).getPosition();
            }
            if ("folder".equals(contentNode.getOriginalObjectType())) {
                return ValueUtil.getInteger(contentNode.getComputedData(), "sortPriority");
            }
            return 0;
        }

        public int compare(ContentNode contentNode, ContentNode contentNode2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ec2ff847", new Object[]{this, contentNode, contentNode2})).intValue();
            }
            long sortKey = getSortKey(contentNode);
            long sortKey2 = getSortKey(contentNode2);
            int sortPriority = getSortPriority(contentNode);
            int sortPriority2 = getSortPriority(contentNode2);
            if (sortPriority == sortPriority2 && sortKey == sortKey2) {
                return 0;
            }
            return sortPriority != sortPriority2 ? sortPriority < sortPriority2 ? -1 : 1 : sortKey < sortKey2 ? -1 : 1;
        }
    }

    static {
        t2o.a(550502419);
        t2o.a(537919673);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Transformer
    public SharedState transform(Action action, SharedState sharedState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedState) ipChange.ipc$dispatch("e602685c", new Object[]{this, action, sharedState});
        }
        TreeQueryResult treeQueryResult = (TreeQueryResult) sharedState.getOriginData("treeSource", TreeQueryResult.class, null);
        if (treeQueryResult == null) {
            return sharedState;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(treeQueryResult.list);
        Collections.sort(arrayList3, new SortHelper.ReversedComparatorWrapper(new NodeComparator(treeQueryResult.mergedData.originalDataPool.get("conversation"))));
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            ContentNode contentNode = (ContentNode) it.next();
            if (ValueUtil.getInteger(contentNode.getComputedData(), "section") > 0) {
                ArrayList arrayList4 = new ArrayList();
                if (contentNode.getChildNode() != null) {
                    arrayList4.addAll(contentNode.getChildNode());
                }
                Collections.sort(arrayList4, new SortHelper.ReversedComparatorWrapper(new SortHelper.RawNodeComparator()));
                arrayList.add(arrayList4);
            } else {
                arrayList2.add(contentNode);
            }
        }
        arrayList.add(arrayList2);
        HashMap hashMap = new HashMap(4);
        hashMap.put("sectionList", arrayList);
        return sharedState.updateRuntimeData(hashMap);
    }
}
