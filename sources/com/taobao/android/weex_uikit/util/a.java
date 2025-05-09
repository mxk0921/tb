package com.taobao.android.weex_uikit.util;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.util.FunctionParser;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.ooe;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a<V> extends FunctionParser<String, List<V>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.weex_uikit.util.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class C0522a implements FunctionParser.c<String, List<V>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10009a;

        public C0522a(b bVar) {
            this.f10009a = bVar;
        }

        public Map<String, List<V>> a(String str, List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("7f9ebb93", new Object[]{this, str, list});
            }
            HashMap hashMap = new HashMap();
            LinkedList linkedList = new LinkedList();
            for (String str2 : list) {
                linkedList.add(((ooe.b) this.f10009a).b(str2));
            }
            hashMap.put(str, linkedList);
            return hashMap;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b<V> {
    }

    static {
        t2o.a(986710115);
    }

    public a(String str, b<V> bVar) {
        super(str, new C0522a(bVar));
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/util/SingleFunctionParser");
    }

    public List<V> e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4981acc3", new Object[]{this, str});
        }
        LinkedHashMap<String, V> d = d();
        if (d.containsKey(str)) {
            return (List) d.get(str);
        }
        return null;
    }
}
