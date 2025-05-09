package com.taobao.themis.external.embed;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/taobao/themis/external/embed/TMSEmbedSolutionType;", "", "(Ljava/lang/String;I)V", "convert", "Lcom/taobao/themis/kernel/solution/TMSSolutionType;", "WIDGET", "CLUSTER_WIDGET", "UNIAPP", "WEB_SINGLE_PAGE", "WEEX", "themis_interface_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSEmbedSolutionType extends Enum<TMSEmbedSolutionType> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TMSEmbedSolutionType WIDGET = new TMSEmbedSolutionType("WIDGET", 0);
    public static final TMSEmbedSolutionType CLUSTER_WIDGET = new TMSEmbedSolutionType("CLUSTER_WIDGET", 1);
    public static final TMSEmbedSolutionType UNIAPP = new TMSEmbedSolutionType("UNIAPP", 2);
    public static final TMSEmbedSolutionType WEB_SINGLE_PAGE = new TMSEmbedSolutionType("WEB_SINGLE_PAGE", 3);
    public static final TMSEmbedSolutionType WEEX = new TMSEmbedSolutionType("WEEX", 4);
    private static final /* synthetic */ TMSEmbedSolutionType[] $VALUES = $values();

    private static final /* synthetic */ TMSEmbedSolutionType[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TMSEmbedSolutionType[]) ipChange.ipc$dispatch("9e47dedf", new Object[0]) : new TMSEmbedSolutionType[]{WIDGET, CLUSTER_WIDGET, UNIAPP, WEB_SINGLE_PAGE, WEEX};
    }

    private TMSEmbedSolutionType(String str, int i) {
    }

    public static /* synthetic */ Object ipc$super(TMSEmbedSolutionType tMSEmbedSolutionType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/external/embed/TMSEmbedSolutionType");
    }

    public static TMSEmbedSolutionType valueOf(String str) {
        Object valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            valueOf = ipChange.ipc$dispatch("8390ce14", new Object[]{str});
        } else {
            valueOf = Enum.valueOf(TMSEmbedSolutionType.class, str);
        }
        return (TMSEmbedSolutionType) valueOf;
    }

    public static TMSEmbedSolutionType[] values() {
        Object clone;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            clone = ipChange.ipc$dispatch("af98ba83", new Object[0]);
        } else {
            clone = $VALUES.clone();
        }
        return (TMSEmbedSolutionType[]) clone;
    }

    public final TMSSolutionType convert() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSSolutionType) ipChange.ipc$dispatch("bf8c1b8", new Object[]{this});
        }
        return TMSSolutionType.valueOf(name());
    }
}
