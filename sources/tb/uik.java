package tb;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class uik extends jkk {

    /* renamed from: a  reason: collision with root package name */
    public static final uik f29402a = new uik();

    @Override // tb.jkk, tb.iik
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.k1();
            return;
        }
        AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
        jSONWriter.d1(atomicIntegerArray.length());
        for (int i = 0; i < atomicIntegerArray.length(); i++) {
            jSONWriter.L1(atomicIntegerArray.get(i));
        }
    }

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.k1();
            return;
        }
        AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
        jSONWriter.c1();
        for (int i = 0; i < atomicIntegerArray.length(); i++) {
            if (i != 0) {
                jSONWriter.t1();
            }
            jSONWriter.L1(atomicIntegerArray.get(i));
        }
        jSONWriter.e();
    }
}
