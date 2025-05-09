package com.taobao.themis.inside.adapter;

import android.os.Build;
import android.os.Trace;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.ITraceAdapter;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Pair;
import tb.ckf;
import tb.hpl;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ5\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0014J5\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/taobao/themis/inside/adapter/DefaultTraceAdapter;", "Lcom/taobao/themis/kernel/adapter/ITraceAdapter;", "<init>", "()V", "", hpl.SECTION_NAME, "Lkotlin/Pair;", "arg1", "arg2", "Ltb/xhv;", "begin", "(Ljava/lang/String;Lkotlin/Pair;Lkotlin/Pair;)V", "end", "(Ljava/lang/String;)V", "", "id", "arg", "asyncBegin", "(Ljava/lang/String;JLkotlin/Pair;)V", "flowBegin", "(Ljava/lang/String;J)V", "flowStep", "flowEnd", "asyncEnd", "generateTraceId", "()J", "themis_inside_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class DefaultTraceAdapter implements ITraceAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f13521a = new AtomicInteger(0);

    static {
        t2o.a(837812258);
        t2o.a(839909486);
    }

    @Override // com.taobao.themis.kernel.adapter.ITraceAdapter
    public void asyncBegin(String str, long j, Pair<String, String> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce01c393", new Object[]{this, str, new Long(j), pair});
            return;
        }
        ckf.g(str, hpl.SECTION_NAME);
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.beginAsyncSection(str, (int) j);
        }
    }

    @Override // com.taobao.themis.kernel.adapter.ITraceAdapter
    public void asyncEnd(String str, long j, Pair<String, String> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5870bc5", new Object[]{this, str, new Long(j), pair});
            return;
        }
        ckf.g(str, hpl.SECTION_NAME);
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.endAsyncSection(str, (int) j);
        }
    }

    @Override // com.taobao.themis.kernel.adapter.ITraceAdapter
    public void begin(String str, Pair<String, String> pair, Pair<String, String> pair2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c17f169a", new Object[]{this, str, pair, pair2});
            return;
        }
        ckf.g(str, hpl.SECTION_NAME);
        Trace.beginSection(str);
    }

    @Override // com.taobao.themis.kernel.adapter.ITraceAdapter
    public void end(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41f4dd2c", new Object[]{this, str});
            return;
        }
        ckf.g(str, hpl.SECTION_NAME);
        Trace.endSection();
    }

    @Override // com.taobao.themis.kernel.adapter.ITraceAdapter
    public void flowBegin(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ac70bd8", new Object[]{this, str, new Long(j)});
        } else {
            ckf.g(str, hpl.SECTION_NAME);
        }
    }

    @Override // com.taobao.themis.kernel.adapter.ITraceAdapter
    public void flowEnd(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("834e9ee6", new Object[]{this, str, new Long(j)});
        } else {
            ckf.g(str, hpl.SECTION_NAME);
        }
    }

    @Override // com.taobao.themis.kernel.adapter.ITraceAdapter
    public void flowStep(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50723bf9", new Object[]{this, str, new Long(j)});
        } else {
            ckf.g(str, hpl.SECTION_NAME);
        }
    }

    @Override // com.taobao.themis.kernel.adapter.ITraceAdapter
    public long generateTraceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("898a906", new Object[]{this})).longValue();
        }
        return this.f13521a.incrementAndGet();
    }
}
