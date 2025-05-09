package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.evo.EVOExperiment;
import com.alibaba.evo.EVOExperimentCondition;
import com.alibaba.evo.EVOExperimentConditions;
import com.alibaba.evo.internal.bucketing.model.ExperimentDomainV5PO;
import com.alibaba.evo.internal.bucketing.model.ExperimentGroupV5;
import com.alibaba.evo.internal.bucketing.model.ExperimentLayerV5PO;
import com.alibaba.evo.internal.bucketing.model.ExperimentV5;
import com.alibaba.evo.internal.bucketing.model.ExperimentVariationConfigV5;
import com.alibaba.evo.internal.bucketing.model.ExperimentVariationConfigV5PO;
import com.alibaba.evo.internal.database.ExperimentDO;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.bucketing.expression.Expression;
import com.alibaba.ut.abtest.bucketing.expression.ExpressionCriterion;
import com.alibaba.ut.abtest.internal.bucketing.ExperimentRoutingType;
import com.alibaba.ut.abtest.internal.bucketing.HighPriorityExperimentStorage;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentBetaDevice;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentCognation;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentCognationType;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentGroup;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentTrack;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentTrackPO;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentType;
import com.alibaba.ut.abtest.internal.track.ExperimentServerTrackPO;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class go8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a extends TypeReference<List<ExperimentTrackPO>> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class b extends TypeReference<Set<Long>> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class c extends TypeReference<List<ExperimentTrack>> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class d extends TypeReference<Map<String, String>> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class e extends TypeReference<List<ExperimentGroupV5>> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class f extends TypeReference<Map<String, ExperimentVariationConfigV5>> {
    }

    static {
        t2o.a(961544319);
    }

    public static ExperimentCognation a(ExperimentDomainV5PO experimentDomainV5PO, ExperimentCognation experimentCognation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentCognation) ipChange.ipc$dispatch("dbf4615a", new Object[]{experimentDomainV5PO, experimentCognation});
        }
        ExperimentCognation experimentCognation2 = new ExperimentCognation();
        experimentCognation2.setId(experimentDomainV5PO.id);
        experimentCognation2.setCode(experimentDomainV5PO.code);
        experimentCognation2.setRatioRange(experimentDomainV5PO.ratioRange);
        experimentCognation2.setVariations(experimentDomainV5PO.variations);
        if (experimentCognation == null) {
            experimentCognation2.setType(ExperimentCognationType.RootDomain);
            return experimentCognation2;
        }
        experimentCognation2.setType(ExperimentCognationType.Domain);
        if (experimentCognation.getChild() == null) {
            experimentCognation.setChild(experimentCognation2);
        } else {
            experimentCognation = experimentCognation.copy();
            ExperimentCognation child = experimentCognation.getChild();
            while (child.getChild() != null) {
                child = child.getChild();
            }
            child.setChild(experimentCognation2);
        }
        return experimentCognation;
    }

    public static EVOExperiment b(ExperimentV5 experimentV5) {
        EVOExperimentConditions eVOExperimentConditions;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EVOExperiment) ipChange.ipc$dispatch("df670b2a", new Object[]{experimentV5});
        }
        Expression conditionExpression = experimentV5.getConditionExpression();
        String str2 = null;
        if (conditionExpression == null || conditionExpression.criterions == null) {
            eVOExperimentConditions = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (ExpressionCriterion expressionCriterion : conditionExpression.criterions) {
                arrayList.add(new EVOExperimentCondition(expressionCriterion.name, expressionCriterion.value, expressionCriterion.operator));
            }
            eVOExperimentConditions = new EVOExperimentConditions(arrayList);
        }
        String[] e2 = a1.e(experimentV5.getKey());
        if (e2 != null) {
            str = e2[0];
        } else {
            str = null;
        }
        if (e2 != null) {
            str2 = e2[1];
        }
        return new EVOExperiment(experimentV5.getId(), experimentV5.getReleaseId(), str, str2, eVOExperimentConditions);
    }

    public static ExperimentDO c(ExperimentV5 experimentV5, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentDO) ipChange.ipc$dispatch("44013b2c", new Object[]{experimentV5, new Long(j), new Long(j2)});
        }
        ExperimentDO experimentDO = new ExperimentDO();
        experimentDO.setId(experimentV5.getId());
        experimentDO.setReleaseId(experimentV5.getReleaseId());
        experimentDO.setKey(experimentV5.getKey());
        if (experimentV5.getType() == null) {
            experimentDO.setType(ExperimentType.AbComponent.getValue());
        } else {
            experimentDO.setType(experimentV5.getType().getValue());
        }
        experimentDO.setBeginTime(experimentV5.getBeginTime());
        experimentDO.setEndTime(experimentV5.getEndTime());
        if (experimentV5.getTracks() != null) {
            experimentDO.setTracks(uwf.e(experimentV5.getTracks()));
        }
        experimentDO.setCondition(experimentV5.getCondition());
        if (experimentV5.getCognation() != null) {
            experimentDO.setCognation(uwf.d(experimentV5.getCognation()));
        }
        if (experimentV5.getGroups() != null) {
            experimentDO.setGroups(uwf.e(experimentV5.getGroups()));
        }
        if (experimentV5.getVariations() != null) {
            experimentDO.setVariations(uwf.f(experimentV5.getVariations()));
        }
        if (experimentV5.getVariationConfigs() != null) {
            experimentDO.setVariationConfigs(uwf.f(experimentV5.getVariationConfigs()));
        }
        experimentDO.setHitCount(j);
        experimentDO.setHitLatestTime(j2);
        experimentDO.setRetain(experimentV5.isRetain());
        experimentDO.setPriorityLevel(experimentV5.getPriorityLevel());
        experimentDO.setExpIndexType(experimentV5.getExpIndexType());
        experimentDO.setExpPublishType(experimentV5.getExpPublishType());
        return experimentDO;
    }

    public static List<ExperimentGroup> d(List<ExperimentServerTrackPO> list, String str) {
        List list2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("efa69f98", new Object[]{list, str});
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ExperimentServerTrackPO experimentServerTrackPO : list) {
            if (experimentServerTrackPO == null || experimentServerTrackPO.releaseId <= 0 || experimentServerTrackPO.bucketId <= 0 || TextUtils.isEmpty(experimentServerTrackPO.component) || TextUtils.isEmpty(experimentServerTrackPO.module)) {
                ogh.l("ExperimentBuilder", "服务端实验埋点规则内容不合法！埋点规则=" + str);
            } else {
                ExperimentGroup experimentGroup = new ExperimentGroup();
                experimentGroup.setId(experimentServerTrackPO.bucketId);
                experimentGroup.setReleaseId(experimentServerTrackPO.releaseId);
                experimentGroup.setExperimentId(experimentServerTrackPO.experimentId);
                if (TextUtils.equals("expt", experimentServerTrackPO.type)) {
                    if (TextUtils.equals(experimentServerTrackPO.component, UTABTest.COMPONENT_URI)) {
                        experimentGroup.setType(ExperimentType.AbUri);
                    } else {
                        experimentGroup.setType(ExperimentType.AbComponent);
                    }
                } else if (TextUtils.equals("dy", experimentServerTrackPO.type)) {
                    experimentGroup.setType(ExperimentType.Redirect);
                } else {
                    experimentGroup.setType(ExperimentType.AbComponent);
                }
                if (experimentGroup.getType() == ExperimentType.Redirect || experimentGroup.getType() == ExperimentType.AbUri) {
                    Uri j = tnv.j(experimentServerTrackPO.module);
                    if (j == null) {
                        ogh.l("ExperimentBuilder", "服务端实验埋点规则内容不合法，URI无法解析！URI=" + experimentServerTrackPO.module);
                    } else {
                        experimentGroup.setUri(j);
                        experimentGroup.setKey(experimentServerTrackPO.module);
                    }
                } else {
                    experimentGroup.setKey(a1.a(experimentServerTrackPO.component, experimentServerTrackPO.module));
                }
                if (!TextUtils.isEmpty(experimentServerTrackPO.trackConfigs) && (list2 = (List) uwf.b(experimentServerTrackPO.trackConfigs, new a().getType())) != null && !list2.isEmpty()) {
                    experimentGroup.setTracks(i(list2, null));
                }
                arrayList.add(experimentGroup);
            }
        }
        return arrayList;
    }

    public static ro8 f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ro8) ipChange.ipc$dispatch("e2db95cb", new Object[]{str, str2});
        }
        try {
            return e(new JSONReader(new InputStreamReader(new FileInputStream(str), "UTF-8")), str2);
        } catch (Throwable th) {
            ku0.j("ExperimentBuilder.createExperimentResponseDataV5", th);
            return null;
        }
    }

    public static ro8 g(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ro8) ipChange.ipc$dispatch("6a002c48", new Object[]{bArr, str});
        }
        return e(new JSONReader(new InputStreamReader(new ByteArrayInputStream(bArr))), str);
    }

    public static ExperimentTrack h(ExperimentTrackPO experimentTrackPO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentTrack) ipChange.ipc$dispatch("7b42355c", new Object[]{experimentTrackPO});
        }
        ExperimentTrack experimentTrack = new ExperimentTrack();
        experimentTrack.setPageNames(experimentTrackPO.pageNames);
        experimentTrack.setAppScope(experimentTrackPO.appScope);
        return experimentTrack;
    }

    public static List<ExperimentTrack> i(List<ExperimentTrackPO> list, ExperimentGroup experimentGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("144e0c7f", new Object[]{list, experimentGroup});
        }
        ArrayList arrayList = new ArrayList();
        for (ExperimentTrackPO experimentTrackPO : list) {
            arrayList.add(h(experimentTrackPO));
        }
        return arrayList;
    }

    public static ExperimentCognation j(ExperimentLayerV5PO experimentLayerV5PO, ExperimentCognation experimentCognation, ExperimentCognationType experimentCognationType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentCognation) ipChange.ipc$dispatch("45ec0216", new Object[]{experimentLayerV5PO, experimentCognation, experimentCognationType});
        }
        ExperimentCognation experimentCognation2 = new ExperimentCognation();
        if (experimentCognation.getChild() == null) {
            experimentCognation.setChild(experimentCognation2);
        } else {
            ExperimentCognation child = experimentCognation.getChild();
            while (child.getChild() != null) {
                child = child.getChild();
            }
            child.setChild(experimentCognation2);
        }
        experimentCognation2.setId(experimentLayerV5PO.id);
        experimentCognation2.setRoutingFactor(experimentLayerV5PO.routingFactor);
        experimentCognation2.setType(experimentCognationType);
        experimentCognation2.setBucketNum(experimentLayerV5PO.bucketNum);
        experimentCognation2.setRoutingAlg(experimentLayerV5PO.routingAlg);
        int i = experimentLayerV5PO.routingType;
        if (i == 2) {
            experimentCognation2.setRoutingType(ExperimentRoutingType.UserId);
        } else if (i == 1) {
            experimentCognation2.setRoutingType(ExperimentRoutingType.Utdid);
        } else {
            experimentCognation2.setRoutingType(ExperimentRoutingType.Utdid);
        }
        return experimentCognation2;
    }

    public static List<ExperimentV5> k(ExperimentDomainV5PO experimentDomainV5PO, ExperimentCognation experimentCognation, String str) {
        List<ExperimentV5> r;
        List<ExperimentV5> r2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d3a49c1e", new Object[]{experimentDomainV5PO, experimentCognation, str});
        }
        ArrayList arrayList = new ArrayList();
        List<ExperimentLayerV5PO> list = experimentDomainV5PO.launchLayers;
        if (!(list == null || (r2 = r(experimentDomainV5PO, list, ExperimentCognationType.LaunchLayer, experimentCognation, str)) == null)) {
            arrayList.addAll(r2);
        }
        List<ExperimentLayerV5PO> list2 = experimentDomainV5PO.normalLayers;
        if (!(list2 == null || (r = r(experimentDomainV5PO, list2, ExperimentCognationType.Layer, experimentCognation, str)) == null)) {
            arrayList.addAll(r);
        }
        return arrayList;
    }

    public static ExperimentV5 l(ExperimentDO experimentDO) {
        List<ExperimentTrack> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentV5) ipChange.ipc$dispatch("23c93218", new Object[]{experimentDO});
        }
        boolean x = n.j().a().x();
        if (TextUtils.isEmpty(experimentDO.getCognation()) || TextUtils.isEmpty(experimentDO.getKey())) {
            ogh.g("ExperimentBuilder", "实验数据读取错误，丢失关键信息。实验ID=" + experimentDO.getId());
            return null;
        }
        ExperimentV5 experimentV5 = new ExperimentV5(experimentDO);
        if (!x) {
            ExperimentCognation experimentCognation = (ExperimentCognation) uwf.a(experimentDO.getCognation(), ExperimentCognation.class);
            if (experimentCognation == null) {
                ogh.g("ExperimentBuilder", "实验数据读取错误，丢失关键信息。实验ID=" + experimentDO.getId());
                return null;
            }
            experimentV5.setCognation(experimentCognation);
        }
        experimentV5.setId(experimentDO.getId());
        experimentV5.setReleaseId(experimentDO.getReleaseId());
        experimentV5.setKey(experimentDO.getKey());
        experimentV5.setType(ExperimentType.valueOf(experimentDO.getType()));
        experimentV5.setBeginTime(experimentDO.getBeginTime());
        experimentV5.setEndTime(experimentDO.getEndTime());
        experimentV5.setPriorityLevel(experimentDO.getPriorityLevel());
        experimentV5.setExpIndexType(experimentDO.getExpIndexType());
        experimentV5.setExpPublishType(experimentDO.getExpPublishType());
        if (!x && !TextUtils.isEmpty(experimentDO.getTracks()) && (list = (List) uwf.b(experimentDO.getTracks(), new c().getType())) != null && !list.isEmpty()) {
            experimentV5.setTracks(list);
        }
        if (!x && !TextUtils.isEmpty(experimentDO.getCondition())) {
            experimentV5.setConditionExpression((Expression) uwf.a(experimentDO.getCondition(), Expression.class));
        }
        if (!x && !TextUtils.isEmpty(experimentDO.getVariations())) {
            experimentV5.setVariations((Map) uwf.b(experimentDO.getVariations(), new d().getType()));
        }
        experimentV5.setRetain(experimentDO.isRetain());
        if (!x && !TextUtils.isEmpty(experimentDO.getGroups())) {
            List<ExperimentGroupV5> list2 = (List) uwf.b(experimentDO.getGroups(), new e().getType());
            if (list2 != null && !list2.isEmpty()) {
                for (ExperimentGroupV5 experimentGroupV5 : list2) {
                    if (!TextUtils.isEmpty(experimentGroupV5.getCondition())) {
                        experimentGroupV5.setConditionExpression((Expression) uwf.a(experimentGroupV5.getCondition(), Expression.class));
                        experimentGroupV5.setCondition(null);
                    }
                    if (experimentGroupV5.getIgnoreUrls() != null && !experimentGroupV5.getIgnoreUrls().isEmpty()) {
                        HashSet hashSet = new HashSet(experimentGroupV5.getIgnoreUrls().size());
                        for (String str : experimentGroupV5.getIgnoreUrls()) {
                            Uri j = tnv.j(str);
                            if (j != null) {
                                hashSet.add(j);
                            }
                        }
                        if (!hashSet.isEmpty()) {
                            experimentGroupV5.setIgnoreUris(hashSet);
                            experimentGroupV5.setIgnoreUrls(null);
                        }
                    }
                }
            }
            experimentV5.setGroups(list2);
        }
        if (!x && !TextUtils.isEmpty(experimentDO.getVariationConfigs())) {
            experimentV5.setVariationConfigs((Map) uwf.b(experimentDO.getVariationConfigs(), new f().getType()));
        }
        return experimentV5;
    }

    public static ExperimentGroupV5 m(ExperimentGroup experimentGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentGroupV5) ipChange.ipc$dispatch("965c071a", new Object[]{experimentGroup});
        }
        ExperimentGroupV5 experimentGroupV5 = new ExperimentGroupV5();
        experimentGroupV5.setId(experimentGroup.getId());
        experimentGroupV5.setCondition(experimentGroup.getFeatureCondition());
        experimentGroupV5.setConditionExpression(experimentGroup.getFeatureConditionExpression());
        experimentGroupV5.setRatioRange(experimentGroup.getRatioRange());
        experimentGroupV5.setVariations(experimentGroup.getVariations());
        experimentGroupV5.setIgnoreUrls(experimentGroup.getIgnoreUrls());
        experimentGroupV5.setIgnoreUris(experimentGroup.getIgnoreUris());
        return experimentGroupV5;
    }

    public static ExperimentV5 n(ExperimentGroup experimentGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentV5) ipChange.ipc$dispatch("539ab61a", new Object[]{experimentGroup});
        }
        ExperimentV5 experimentV5 = new ExperimentV5();
        experimentV5.setId(experimentGroup.getExperimentId());
        experimentV5.setReleaseId(experimentGroup.getReleaseId());
        experimentV5.setKey(experimentGroup.getKey());
        experimentV5.setUri(experimentGroup.getUri());
        experimentV5.setType(experimentGroup.getType());
        experimentV5.setBeginTime(experimentGroup.getBeginTime());
        experimentV5.setEndTime(experimentGroup.getEndTime());
        experimentV5.setTracks(experimentGroup.getTracks());
        experimentV5.setCondition(experimentGroup.getFeatureCondition());
        experimentV5.setConditionExpression(experimentGroup.getFeatureConditionExpression());
        experimentV5.setCognation(experimentGroup.getCognation());
        ArrayList arrayList = new ArrayList(6);
        arrayList.add(m(experimentGroup));
        experimentV5.setGroups(arrayList);
        return experimentV5;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.alibaba.evo.internal.bucketing.model.ExperimentGroupV5 o(com.alibaba.evo.internal.bucketing.model.ExperimentGroupV5PO r9) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.go8.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "7e114ac0"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r9
            java.lang.Object r9 = r0.ipc$dispatch(r1, r2)
            com.alibaba.evo.internal.bucketing.model.ExperimentGroupV5 r9 = (com.alibaba.evo.internal.bucketing.model.ExperimentGroupV5) r9
            return r9
        L_0x0015:
            java.lang.String r0 = r9.condition
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 != 0) goto L_0x004c
            java.lang.String r0 = r9.condition     // Catch: all -> 0x0042
            java.lang.Class<com.alibaba.ut.abtest.bucketing.expression.Expression> r2 = com.alibaba.ut.abtest.bucketing.expression.Expression.class
            java.lang.Object r0 = tb.uwf.a(r0, r2)     // Catch: all -> 0x0042
            com.alibaba.ut.abtest.bucketing.expression.Expression r0 = (com.alibaba.ut.abtest.bucketing.expression.Expression) r0     // Catch: all -> 0x0042
            if (r0 == 0) goto L_0x0040
            tb.n r2 = tb.n.j()     // Catch: all -> 0x003e
            tb.ur8 r2 = r2.h()     // Catch: all -> 0x003e
            long r6 = r9.id     // Catch: all -> 0x003e
            r4 = 0
            r3 = r0
            boolean r2 = r2.a(r3, r4, r6)     // Catch: all -> 0x003e
            if (r2 != 0) goto L_0x0040
            return r1
        L_0x003e:
            r1 = move-exception
            goto L_0x0046
        L_0x0040:
            r1 = r0
            goto L_0x004c
        L_0x0042:
            r0 = move-exception
            r8 = r1
            r1 = r0
            r0 = r8
        L_0x0046:
            java.lang.String r2 = "ExperimentBuilder.experimentGroupV5PO2ExperimentV5"
            tb.ku0.j(r2, r1)
            goto L_0x0040
        L_0x004c:
            com.alibaba.evo.internal.bucketing.model.ExperimentGroupV5 r0 = new com.alibaba.evo.internal.bucketing.model.ExperimentGroupV5
            r0.<init>()
            long r2 = r9.id
            r0.setId(r2)
            int[][] r2 = r9.ratioRange
            r0.setRatioRange(r2)
            java.util.Map<java.lang.String, java.lang.String> r2 = r9.variations
            if (r2 == 0) goto L_0x0069
            java.util.HashMap r2 = new java.util.HashMap
            java.util.Map<java.lang.String, java.lang.String> r3 = r9.variations
            r2.<init>(r3)
            r0.setVariations(r2)
        L_0x0069:
            java.lang.String r2 = r9.condition
            r0.setCondition(r2)
            r0.setConditionExpression(r1)
            java.util.Set<java.lang.String> r1 = r9.ignoreUrls
            r0.setIgnoreUrls(r1)
            java.util.Set<java.lang.String> r1 = r9.ignoreUrls
            if (r1 == 0) goto L_0x00b0
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x00b0
            java.util.HashSet r1 = new java.util.HashSet
            java.util.Set<java.lang.String> r2 = r9.ignoreUrls
            int r2 = r2.size()
            r1.<init>(r2)
            java.util.Set<java.lang.String> r9 = r9.ignoreUrls
            java.util.Iterator r9 = r9.iterator()
        L_0x0091:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x00a7
            java.lang.Object r2 = r9.next()
            java.lang.String r2 = (java.lang.String) r2
            android.net.Uri r2 = tb.tnv.j(r2)
            if (r2 == 0) goto L_0x0091
            r1.add(r2)
            goto L_0x0091
        L_0x00a7:
            boolean r9 = r1.isEmpty()
            if (r9 != 0) goto L_0x00b0
            r0.setIgnoreUris(r1)
        L_0x00b0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.go8.o(com.alibaba.evo.internal.bucketing.model.ExperimentGroupV5PO):com.alibaba.evo.internal.bucketing.model.ExperimentGroupV5");
    }

    public static ExperimentCognation p(ExperimentDO experimentDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentCognation) ipChange.ipc$dispatch("d3c5b8b9", new Object[]{experimentDO});
        }
        if (TextUtils.isEmpty(experimentDO.getCognation())) {
            return null;
        }
        return (ExperimentCognation) uwf.a(experimentDO.getCognation(), ExperimentCognation.class);
    }

    public static boolean q(List<ExperimentBetaDevice> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cacc94ac", new Object[]{list})).booleanValue();
        }
        String[] strArr = {d3r.c().d(), n.j().p(), n.j().o()};
        for (ExperimentBetaDevice experimentBetaDevice : list) {
            Set<String> set = experimentBetaDevice.data;
            if (set != null && !set.isEmpty() && experimentBetaDevice.type == 1) {
                for (int i = 0; i < 3; i++) {
                    String str = strArr[i];
                    if (!TextUtils.isEmpty(str) && experimentBetaDevice.data.contains(str)) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    public static ExperimentVariationConfigV5 s(ExperimentVariationConfigV5PO experimentVariationConfigV5PO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentVariationConfigV5) ipChange.ipc$dispatch("9e71e799", new Object[]{experimentVariationConfigV5PO});
        }
        if (experimentVariationConfigV5PO == null) {
            return null;
        }
        ExperimentVariationConfigV5 experimentVariationConfigV5 = new ExperimentVariationConfigV5();
        experimentVariationConfigV5.setScope(experimentVariationConfigV5PO.scope);
        return experimentVariationConfigV5;
    }

    public static ro8 e(JSONReader jSONReader, String str) {
        Throwable th;
        List<ExperimentV5> k;
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ro8) ipChange.ipc$dispatch("975009d9", new Object[]{jSONReader, str});
        }
        ro8 ro8Var = null;
        try {
            jSONReader.startObject();
            ro8 ro8Var2 = new ro8();
            try {
                HashMap hashMap = new HashMap();
                new HashMap();
                while (jSONReader.hasNext()) {
                    String readString = jSONReader.readString();
                    if (TextUtils.equals("sign", readString)) {
                        ro8Var2.f27497a = jSONReader.readString();
                    } else if (TextUtils.equals("version", readString)) {
                        ro8Var2.b = jSONReader.readLong().longValue();
                    } else if (TextUtils.equals("rootDomains", readString)) {
                        ro8Var2.c = new ArrayList();
                        jSONReader.startArray();
                        while (jSONReader.hasNext()) {
                            ExperimentDomainV5PO experimentDomainV5PO = (ExperimentDomainV5PO) jSONReader.readObject((Class<Object>) ExperimentDomainV5PO.class);
                            if (!(experimentDomainV5PO == null || (k = k(experimentDomainV5PO, null, str)) == null)) {
                                for (ExperimentV5 experimentV5 : k) {
                                    for (ExperimentCognation cognation = experimentV5.getCognation(); cognation.getChild() != null; cognation = cognation.getChild()) {
                                        cognation.getChild().setParent(cognation);
                                    }
                                    if (experimentV5.isHighPriorityWork()) {
                                        hashMap.put(Long.valueOf(experimentV5.getId()), experimentV5);
                                    }
                                }
                                ((ArrayList) ro8Var2.c).addAll(k);
                            }
                        }
                        jSONReader.endArray();
                    } else if (TextUtils.equals("validBetaSets", readString)) {
                        ro8Var2.d = (Set) jSONReader.readObject((TypeReference<Object>) new b());
                    } else {
                        jSONReader.readObject();
                    }
                }
                jSONReader.endObject();
                if (n.j().a().D()) {
                    i = 2;
                }
                new HighPriorityExperimentStorage().o(ro8Var2.b).n(n.j().a().A()).k(str).l(hashMap.values()).m(i).p();
                try {
                    jSONReader.close();
                    return ro8Var2;
                } catch (Throwable unused) {
                    return ro8Var2;
                }
            } catch (Throwable th2) {
                th = th2;
                ro8Var = ro8Var2;
                try {
                    ku0.j("ExperimentBuilder.createExperimentResponseDataV5.jsonReader", th);
                    return ro8Var;
                } finally {
                    if (jSONReader != null) {
                        try {
                            jSONReader.close();
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x017b, code lost:
        if (r9 == false) goto L_0x017d;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<com.alibaba.evo.internal.bucketing.model.ExperimentV5> r(com.alibaba.evo.internal.bucketing.model.ExperimentDomainV5PO r22, java.util.List<com.alibaba.evo.internal.bucketing.model.ExperimentLayerV5PO> r23, com.alibaba.ut.abtest.internal.bucketing.model.ExperimentCognationType r24, com.alibaba.ut.abtest.internal.bucketing.model.ExperimentCognation r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.go8.r(com.alibaba.evo.internal.bucketing.model.ExperimentDomainV5PO, java.util.List, com.alibaba.ut.abtest.internal.bucketing.model.ExperimentCognationType, com.alibaba.ut.abtest.internal.bucketing.model.ExperimentCognation, java.lang.String):java.util.List");
    }
}
