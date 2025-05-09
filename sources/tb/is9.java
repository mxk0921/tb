package tb;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class is9 {
    public static final String ARG_CACHE_SKSL = "--cache-sksl";
    public static final String ARG_DUMP_SHADER_SKP_ON_SHADER_COMPILATION = "--dump-skp-on-shader-compilation";
    public static final String ARG_ENABLE_SHADER_WARMUP = "--enable-shader-warmup";
    public static final String ARG_ENDLESS_TRACE_BUFFER = "--endless-trace-buffer";
    public static final String ARG_KEY_CACHE_SKSL = "cache-sksl";
    public static final String ARG_KEY_DUMP_SHADER_SKP_ON_SHADER_COMPILATION = "dump-skp-on-shader-compilation";
    public static final String ARG_KEY_ENDLESS_TRACE_BUFFER = "endless-trace-buffer";
    public static final String ARG_KEY_PURGE_PERSISTENT_CACHE = "purge-persistent-cache";
    public static final String ARG_KEY_SHADER_WARMUP = "enable-shader-warmup";
    public static final String ARG_KEY_SKIA_DETERMINISTIC_RENDERING = "skia-deterministic-rendering";
    public static final String ARG_KEY_START_PAUSED = "start-paused";
    public static final String ARG_KEY_TRACE_SKIA = "trace-skia";
    public static final String ARG_KEY_TRACE_STARTUP = "trace-startup";
    public static final String ARG_KEY_TRACE_SYSTRACE = "trace-systrace";
    public static final String ARG_KEY_VERBOSE_LOGGING = "verbose-logging";
    public static final String ARG_PURGE_PERSISTENT_CACHE = "--purge-persistent-cache";
    public static final String ARG_SKIA_DETERMINISTIC_RENDERING = "--skia-deterministic-rendering";
    public static final String ARG_START_PAUSED = "--start-paused";
    public static final String ARG_TRACE_SKIA = "--trace-skia";
    public static final String ARG_TRACE_STARTUP = "--trace-startup";
    public static final String ARG_TRACE_SYSTRACE = "--trace-systrace";
    public static final String ARG_VERBOSE_LOGGING = "--verbose-logging";

    /* renamed from: a  reason: collision with root package name */
    public final Set<String> f21546a;

    static {
        t2o.a(945815691);
    }

    public is9(String[] strArr) {
        this.f21546a = new HashSet(Arrays.asList(strArr));
    }

    public static is9 a(Intent intent) {
        ArrayList arrayList = new ArrayList();
        if (intent.getBooleanExtra(ARG_KEY_TRACE_STARTUP, false)) {
            arrayList.add(ARG_TRACE_STARTUP);
        }
        if (intent.getBooleanExtra(ARG_KEY_START_PAUSED, false)) {
            arrayList.add(ARG_START_PAUSED);
        }
        if (intent.getBooleanExtra(ARG_KEY_ENDLESS_TRACE_BUFFER, false)) {
            arrayList.add(ARG_ENDLESS_TRACE_BUFFER);
        }
        if (intent.getBooleanExtra(ARG_KEY_SKIA_DETERMINISTIC_RENDERING, false)) {
            arrayList.add(ARG_SKIA_DETERMINISTIC_RENDERING);
        }
        if (intent.getBooleanExtra(ARG_KEY_TRACE_SKIA, false)) {
            arrayList.add(ARG_TRACE_SKIA);
        }
        if (intent.getBooleanExtra(ARG_KEY_TRACE_SYSTRACE, false)) {
            arrayList.add(ARG_TRACE_SYSTRACE);
        }
        if (intent.getBooleanExtra(ARG_KEY_DUMP_SHADER_SKP_ON_SHADER_COMPILATION, false)) {
            arrayList.add(ARG_DUMP_SHADER_SKP_ON_SHADER_COMPILATION);
        }
        if (intent.getBooleanExtra(ARG_KEY_CACHE_SKSL, false)) {
            arrayList.add(ARG_CACHE_SKSL);
        }
        if (intent.getBooleanExtra(ARG_KEY_PURGE_PERSISTENT_CACHE, false)) {
            arrayList.add(ARG_PURGE_PERSISTENT_CACHE);
        }
        if (intent.getBooleanExtra(ARG_KEY_VERBOSE_LOGGING, false)) {
            arrayList.add(ARG_VERBOSE_LOGGING);
        }
        if (intent.hasExtra(ARG_KEY_SHADER_WARMUP)) {
            arrayList.add("--enable-shader-warmup=" + intent.getBooleanExtra(ARG_KEY_SHADER_WARMUP, false));
        }
        return new is9(arrayList);
    }

    public String[] b() {
        Set<String> set = this.f21546a;
        return (String[]) set.toArray(new String[set.size()]);
    }

    public is9(List<String> list) {
        this.f21546a = new HashSet(list);
    }
}
