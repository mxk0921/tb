package tb;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class wik extends jkk {

    /* renamed from: a  reason: collision with root package name */
    public static final wik f30722a = new wik();

    @Override // tb.jkk, tb.iik
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.k1();
            return;
        }
        AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
        jSONWriter.d1(atomicLongArray.length());
        for (int i = 0; i < atomicLongArray.length(); i++) {
            jSONWriter.O1(atomicLongArray.get(i));
        }
    }

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.k1();
            return;
        }
        AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
        jSONWriter.c1();
        for (int i = 0; i < atomicLongArray.length(); i++) {
            if (i != 0) {
                jSONWriter.t1();
            }
            jSONWriter.O1(atomicLongArray.get(i));
        }
        jSONWriter.e();
    }
}
