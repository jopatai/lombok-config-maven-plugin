package lombok.maven;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Parameter;

/** This class is generated by ConfigUpdater. DO NOT MODIFY. **/
public abstract class GeneratedLombokConfigMojo extends AbstractMojo
{
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.FIELD)
    static @interface Config {
        String value() default "";
        String list() default "";
    }

    /**
     * <p>If set with the version of checkerframework.org (in major.minor, or just 'true' for the latest supported version), create relevant checkerframework.org annotations for code lombok generates (default: false).</p>
     * Example:
     * <pre>
     * &lt;checkerframework&gt;major.minor (example: 3.2 - and no higher than 4.0) or true or false&lt;/checkerframework&gt;
     * </pre>
     */
    @Config("checkerframework")
    @Parameter(property="lombok.checkerframework")
    String checkerframework;

    /**
     * <p>Which capitalization strategy to use when converting field names to accessor names and vice versa (default: basic).</p>
     * Example:
     * <pre>
     * &lt;accessorsCapitalization&gt;[BASIC | BEANSPEC]&lt;/accessorsCapitalization&gt;
     * </pre>
     */
    @Config("lombok.accessors.capitalization")
    @Parameter(property="lombok.accessors.capitalization")
    String accessorsCapitalization;

    /**
     * <p>Generate setters that return 'this' instead of 'void' (default: false).</p>
     * Example:
     * <pre>
     * &lt;accessorsChain&gt;[false | true]&lt;/accessorsChain&gt;
     * </pre>
     */
    @Config("lombok.accessors.chain")
    @Parameter(property="lombok.accessors.chain")
    String accessorsChain;

    /**
     * <p>Emit a warning or error if @Accessors is used.</p>
     * Example:
     * <pre>
     * &lt;accessorsFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/accessorsFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.accessors.flagUsage")
    @Parameter(property="lombok.accessors.flagUsage")
    String accessorsFlagUsage;

    /**
     * <p>Generate getters and setters using only the field name (no get/set prefix) (default: false).</p>
     * Example:
     * <pre>
     * &lt;accessorsFluent&gt;[false | true]&lt;/accessorsFluent&gt;
     * </pre>
     */
    @Config("lombok.accessors.fluent")
    @Parameter(property="lombok.accessors.fluent")
    String accessorsFluent;

    /**
     * <p>Generate getters, setters and with-ers with the 'final' modifier (default: false).</p>
     * Example:
     * <pre>
     * &lt;accessorsMakeFinal&gt;[false | true]&lt;/accessorsMakeFinal&gt;
     * </pre>
     */
    @Config("lombok.accessors.makeFinal")
    @Parameter(property="lombok.accessors.makeFinal")
    String accessorsMakeFinal;

    /**
     * <p>Strip this field prefix, like 'f' or 'm_', from the names of generated getters, setters, and with-ers.</p>
     * Value is a comma separated list. Example:
     * <pre>
     * &lt;accessorsPrefix&gt;[...text...]&lt;/accessorsPrefix&gt;
     * </pre>
     */
    @Config(value="lombok.accessors.prefix", list="true")
    @Parameter(property="lombok.accessors.prefix")
    String accessorsPrefix;

    /**
     * <p>Generate @javax.annotation.Generated on all generated code (default: follow lombok.addGeneratedAnnotation).</p>
     * Example:
     * <pre>
     * &lt;addJavaxGeneratedAnnotation&gt;[false | true]&lt;/addJavaxGeneratedAnnotation&gt;
     * </pre>
     */
    @Config("lombok.addJavaxGeneratedAnnotation")
    @Parameter(property="lombok.addJavaxGeneratedAnnotation")
    String addJavaxGeneratedAnnotation;

    /**
     * <p>Generate @lombok.Generated on all generated code (default: false).</p>
     * Example:
     * <pre>
     * &lt;addLombokGeneratedAnnotation&gt;[false | true]&lt;/addLombokGeneratedAnnotation&gt;
     * </pre>
     */
    @Config("lombok.addLombokGeneratedAnnotation")
    @Parameter(property="lombok.addLombokGeneratedAnnotation")
    String addLombokGeneratedAnnotation;

    /**
     * <p>Generate some style of null annotation for generated code where this is relevant. (default: none).</p>
     * Example:
     * <pre>
     * &lt;addNullAnnotations&gt;none | javax | eclipse | jetbrains | netbeans | androidx | android.support | checkerframework | findbugs | spring | jml | CUSTOM:com.foo.my.nonnull.annotation:com.foo.my.nullable.annotation&lt;/addNullAnnotations&gt;
     * </pre>
     */
    @Config("lombok.addNullAnnotations")
    @Parameter(property="lombok.addNullAnnotations")
    String addNullAnnotations;

    /**
     * <p>Generate @java.lang.SuppressWarnings("all") on all generated code (default: true).</p>
     * Example:
     * <pre>
     * &lt;addSuppressWarnings&gt;[false | true]&lt;/addSuppressWarnings&gt;
     * </pre>
     */
    @Config("lombok.addSuppressWarnings")
    @Parameter(property="lombok.addSuppressWarnings")
    String addSuppressWarnings;

    /**
     * <p>Emit a warning or error if @AllArgsConstructor is used.</p>
     * Example:
     * <pre>
     * &lt;allArgsConstructorFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/allArgsConstructorFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.allArgsConstructor.flagUsage")
    @Parameter(property="lombok.allArgsConstructor.flagUsage")
    String allArgsConstructorFlagUsage;

    /**
     * <p>Generate @ConstructorProperties for generated constructors (default: false).</p>
     * Example:
     * <pre>
     * &lt;anyConstructorAddConstructorProperties&gt;[false | true]&lt;/anyConstructorAddConstructorProperties&gt;
     * </pre>
     */
    @Config("lombok.anyConstructor.addConstructorProperties")
    @Parameter(property="lombok.anyConstructor.addConstructorProperties")
    String anyConstructorAddConstructorProperties;

    /**
     * <p>Emit a warning or error if any of the XxxArgsConstructor annotations are used.</p>
     * Example:
     * <pre>
     * &lt;anyConstructorFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/anyConstructorFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.anyConstructor.flagUsage")
    @Parameter(property="lombok.anyConstructor.flagUsage")
    String anyConstructorFlagUsage;

    /**
     * <p>Suppress the generation of @ConstructorProperties for generated constructors (default: false).</p>
     * Example:
     * <pre>
     * &lt;anyConstructorSuppressConstructorProperties&gt;[false | true]&lt;/anyConstructorSuppressConstructorProperties&gt;
     * </pre>
     */
    @Config("lombok.anyConstructor.suppressConstructorProperties")
    @Parameter(property="lombok.anyConstructor.suppressConstructorProperties")
    String anyConstructorSuppressConstructorProperties;

    /**
     * <p>Default name of the generated builder class. A * is replaced with the name of the relevant type (default = *Builder).</p>
     * Example:
     * <pre>
     * &lt;builderClassName&gt;[...text...]&lt;/builderClassName&gt;
     * </pre>
     */
    @Config("lombok.builder.className")
    @Parameter(property="lombok.builder.className")
    String builderClassName;

    /**
     * <p>Emit a warning or error if @Builder is used.</p>
     * Example:
     * <pre>
     * &lt;builderFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/builderFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.builder.flagUsage")
    @Parameter(property="lombok.builder.flagUsage")
    String builderFlagUsage;

    /**
     * <p>Emit a warning or error if @Cleanup is used.</p>
     * Example:
     * <pre>
     * &lt;cleanupFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/cleanupFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.cleanup.flagUsage")
    @Parameter(property="lombok.cleanup.flagUsage")
    String cleanupFlagUsage;

    /**
     * <p>Copy these annotations to getters, setters, with methods, builder-setters, etc.</p>
     * Value is a comma separated list. Example:
     * <pre>
     * &lt;copyableAnnotations&gt;[...fully.qualified.Type...]&lt;/copyableAnnotations&gt;
     * </pre>
     */
    @Config(value="lombok.copyableAnnotations", list="true")
    @Parameter(property="lombok.copyableAnnotations")
    String copyableAnnotations;

    /**
     * <p>Emit a warning or error if @Data is used.</p>
     * Example:
     * <pre>
     * &lt;dataFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/dataFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.data.flagUsage")
    @Parameter(property="lombok.data.flagUsage")
    String dataFlagUsage;

    /**
     * <p>Emit a warning or error if @Delegate is used.</p>
     * Example:
     * <pre>
     * &lt;delegateFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/delegateFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.delegate.flagUsage")
    @Parameter(property="lombok.delegate.flagUsage")
    String delegateFlagUsage;

    /**
     * <p>When generating equals and hashCode for classes that extend something (other than Object), either automatically take into account superclass implementation (call), or don't (skip), or warn and don't (warn). (default = warn).</p>
     * Example:
     * <pre>
     * &lt;equalsAndHashCodeCallSuper&gt;[CALL | SKIP | WARN]&lt;/equalsAndHashCodeCallSuper&gt;
     * </pre>
     */
    @Config("lombok.equalsAndHashCode.callSuper")
    @Parameter(property="lombok.equalsAndHashCode.callSuper")
    String equalsAndHashCodeCallSuper;

    /**
     * <p>Don't call the getters but use the fields directly in the generated equals and hashCode method (default = false).</p>
     * Example:
     * <pre>
     * &lt;equalsAndHashCodeDoNotUseGetters&gt;[false | true]&lt;/equalsAndHashCodeDoNotUseGetters&gt;
     * </pre>
     */
    @Config("lombok.equalsAndHashCode.doNotUseGetters")
    @Parameter(property="lombok.equalsAndHashCode.doNotUseGetters")
    String equalsAndHashCodeDoNotUseGetters;

    /**
     * <p>Emit a warning or error if @EqualsAndHashCode is used.</p>
     * Example:
     * <pre>
     * &lt;equalsAndHashCodeFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/equalsAndHashCodeFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.equalsAndHashCode.flagUsage")
    @Parameter(property="lombok.equalsAndHashCode.flagUsage")
    String equalsAndHashCodeFlagUsage;

    /**
     * <p>Emit a warning or error if an experimental feature is used.</p>
     * Example:
     * <pre>
     * &lt;experimentalFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/experimentalFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.experimental.flagUsage")
    @Parameter(property="lombok.experimental.flagUsage")
    String experimentalFlagUsage;

    /**
     * <p>Emit a warning or error if @ExtensionMethod is used.</p>
     * Example:
     * <pre>
     * &lt;extensionMethodFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/extensionMethodFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.extensionMethod.flagUsage")
    @Parameter(property="lombok.extensionMethod.flagUsage")
    String extensionMethodFlagUsage;

    /**
     * <p>Generate @edu.umd.cs.findbugs.annotations.SuppressFBWarnings on all generated code (default: false).</p>
     * Example:
     * <pre>
     * &lt;externFindbugsAddSuppressFBWarnings&gt;[false | true]&lt;/externFindbugsAddSuppressFBWarnings&gt;
     * </pre>
     */
    @Config("lombok.extern.findbugs.addSuppressFBWarnings")
    @Parameter(property="lombok.extern.findbugs.addSuppressFBWarnings")
    String externFindbugsAddSuppressFBWarnings;

    /**
     * <p>If true, fields, in any file (lombok annotated or not) are marked as final. Use @NonFinal to override this.</p>
     * Example:
     * <pre>
     * &lt;fieldDefaultsDefaultFinal&gt;[false | true]&lt;/fieldDefaultsDefaultFinal&gt;
     * </pre>
     */
    @Config("lombok.fieldDefaults.defaultFinal")
    @Parameter(property="lombok.fieldDefaults.defaultFinal")
    String fieldDefaultsDefaultFinal;

    /**
     * <p>If true, fields without any access modifier, in any file (lombok annotated or not) are marked as private. Use @PackagePrivate or an explicit modifier to override this.</p>
     * Example:
     * <pre>
     * &lt;fieldDefaultsDefaultPrivate&gt;[false | true]&lt;/fieldDefaultsDefaultPrivate&gt;
     * </pre>
     */
    @Config("lombok.fieldDefaults.defaultPrivate")
    @Parameter(property="lombok.fieldDefaults.defaultPrivate")
    String fieldDefaultsDefaultPrivate;

    /**
     * <p>Emit a warning or error if @FieldDefaults is used.</p>
     * Example:
     * <pre>
     * &lt;fieldDefaultsFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/fieldDefaultsFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.fieldDefaults.flagUsage")
    @Parameter(property="lombok.fieldDefaults.flagUsage")
    String fieldDefaultsFlagUsage;

    /**
     * <p>Emit a warning or error if @FieldNameConstants is used.</p>
     * Example:
     * <pre>
     * &lt;fieldNameConstantsFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/fieldNameConstantsFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.fieldNameConstants.flagUsage")
    @Parameter(property="lombok.fieldNameConstants.flagUsage")
    String fieldNameConstantsFlagUsage;

    /**
     * <p>The default name of the inner type generated by @FieldNameConstants. (default: 'Fields').</p>
     * Example:
     * <pre>
     * &lt;fieldNameConstantsInnerTypeName&gt;[...javaIdentifier...]&lt;/fieldNameConstantsInnerTypeName&gt;
     * </pre>
     */
    @Config("lombok.fieldNameConstants.innerTypeName")
    @Parameter(property="lombok.fieldNameConstants.innerTypeName")
    String fieldNameConstantsInnerTypeName;

    /**
     * <p>The default name of the constants inside the inner type generated by @FieldNameConstants follow the variable name precisely. If this config key is true, lombok will uppercase them as best it can. (default: false).</p>
     * Example:
     * <pre>
     * &lt;fieldNameConstantsUppercase&gt;[false | true]&lt;/fieldNameConstantsUppercase&gt;
     * </pre>
     */
    @Config("lombok.fieldNameConstants.uppercase")
    @Parameter(property="lombok.fieldNameConstants.uppercase")
    String fieldNameConstantsUppercase;

    /**
     * <p>Emit a warning or error if @Getter is used.</p>
     * Example:
     * <pre>
     * &lt;getterFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/getterFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.getter.flagUsage")
    @Parameter(property="lombok.getter.flagUsage")
    String getterFlagUsage;

    /**
     * <p>Emit a warning or error if @Getter(lazy=true) is used.</p>
     * Example:
     * <pre>
     * &lt;getterLazyFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/getterLazyFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.getter.lazy.flagUsage")
    @Parameter(property="lombok.getter.lazy.flagUsage")
    String getterLazyFlagUsage;

    /**
     * <p>If true, generate and use getFieldName() for boolean getters instead of isFieldName().</p>
     * Example:
     * <pre>
     * &lt;getterNoIsPrefix&gt;[false | true]&lt;/getterNoIsPrefix&gt;
     * </pre>
     */
    @Config("lombok.getter.noIsPrefix")
    @Parameter(property="lombok.getter.noIsPrefix")
    String getterNoIsPrefix;

    /**
     * <p>Emit a warning or error if @Helper is used.</p>
     * Example:
     * <pre>
     * &lt;helperFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/helperFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.helper.flagUsage")
    @Parameter(property="lombok.helper.flagUsage")
    String helperFlagUsage;

    /**
     * <p>Emit a warning or error if @Jacksonized is used.</p>
     * Example:
     * <pre>
     * &lt;jacksonizedFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/jacksonizedFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.jacksonized.flagUsage")
    @Parameter(property="lombok.jacksonized.flagUsage")
    String jacksonizedFlagUsage;

    /**
     * <p>Emit a warning or error if @CommonsLog is used.</p>
     * Example:
     * <pre>
     * &lt;logApacheCommonsFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/logApacheCommonsFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.log.apacheCommons.flagUsage")
    @Parameter(property="lombok.log.apacheCommons.flagUsage")
    String logApacheCommonsFlagUsage;

    /**
     * <p>Define the generated custom logger field.</p>
     * Example:
     * <pre>
     * &lt;logCustomDeclaration&gt;my.cool.Logger my.cool.LoggerFactory.createLogger()(TOPIC,TYPE)&lt;/logCustomDeclaration&gt;
     * </pre>
     */
    @Config("lombok.log.custom.declaration")
    @Parameter(property="lombok.log.custom.declaration")
    String logCustomDeclaration;

    /**
     * <p>Emit a warning or error if @CustomLog is used.</p>
     * Example:
     * <pre>
     * &lt;logCustomFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/logCustomFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.log.custom.flagUsage")
    @Parameter(property="lombok.log.custom.flagUsage")
    String logCustomFlagUsage;

    /**
     * <p>Make the generated logger fields static (default: true).</p>
     * Example:
     * <pre>
     * &lt;logFieldIsStatic&gt;[false | true]&lt;/logFieldIsStatic&gt;
     * </pre>
     */
    @Config("lombok.log.fieldIsStatic")
    @Parameter(property="lombok.log.fieldIsStatic")
    String logFieldIsStatic;

    /**
     * <p>Use this name for the generated logger fields (default: 'log').</p>
     * Example:
     * <pre>
     * &lt;logFieldName&gt;[...javaIdentifier...]&lt;/logFieldName&gt;
     * </pre>
     */
    @Config("lombok.log.fieldName")
    @Parameter(property="lombok.log.fieldName")
    String logFieldName;

    /**
     * <p>Emit a warning or error if any of the log annotations is used.</p>
     * Example:
     * <pre>
     * &lt;logFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/logFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.log.flagUsage")
    @Parameter(property="lombok.log.flagUsage")
    String logFlagUsage;

    /**
     * <p>Emit a warning or error if @Flogger is used.</p>
     * Example:
     * <pre>
     * &lt;logFloggerFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/logFloggerFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.log.flogger.flagUsage")
    @Parameter(property="lombok.log.flogger.flagUsage")
    String logFloggerFlagUsage;

    /**
     * <p>Emit a warning or error if @Log is used.</p>
     * Example:
     * <pre>
     * &lt;logJavaUtilLoggingFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/logJavaUtilLoggingFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.log.javaUtilLogging.flagUsage")
    @Parameter(property="lombok.log.javaUtilLogging.flagUsage")
    String logJavaUtilLoggingFlagUsage;

    /**
     * <p>Emit a warning or error if @JBossLog is used.</p>
     * Example:
     * <pre>
     * &lt;logJbosslogFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/logJbosslogFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.log.jbosslog.flagUsage")
    @Parameter(property="lombok.log.jbosslog.flagUsage")
    String logJbosslogFlagUsage;

    /**
     * <p>Emit a warning or error if @Log4j is used.</p>
     * Example:
     * <pre>
     * &lt;logLog4jFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/logLog4jFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.log.log4j.flagUsage")
    @Parameter(property="lombok.log.log4j.flagUsage")
    String logLog4jFlagUsage;

    /**
     * <p>Emit a warning or error if @Log4j2 is used.</p>
     * Example:
     * <pre>
     * &lt;logLog4j2FlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/logLog4j2FlagUsage&gt;
     * </pre>
     */
    @Config("lombok.log.log4j2.flagUsage")
    @Parameter(property="lombok.log.log4j2.flagUsage")
    String logLog4j2FlagUsage;

    /**
     * <p>Emit a warning or error if @Slf4j is used.</p>
     * Example:
     * <pre>
     * &lt;logSlf4jFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/logSlf4jFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.log.slf4j.flagUsage")
    @Parameter(property="lombok.log.slf4j.flagUsage")
    String logSlf4jFlagUsage;

    /**
     * <p>Emit a warning or error if @XSlf4j is used.</p>
     * Example:
     * <pre>
     * &lt;logXslf4jFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/logXslf4jFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.log.xslf4j.flagUsage")
    @Parameter(property="lombok.log.xslf4j.flagUsage")
    String logXslf4jFlagUsage;

    /**
     * <p>Generate a private no-args constructor for @Data and @Value (default: false).</p>
     * Example:
     * <pre>
     * &lt;noArgsConstructorExtraPrivate&gt;[false | true]&lt;/noArgsConstructorExtraPrivate&gt;
     * </pre>
     */
    @Config("lombok.noArgsConstructor.extraPrivate")
    @Parameter(property="lombok.noArgsConstructor.extraPrivate")
    String noArgsConstructorExtraPrivate;

    /**
     * <p>Emit a warning or error if @NoArgsConstructor is used.</p>
     * Example:
     * <pre>
     * &lt;noArgsConstructorFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/noArgsConstructorFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.noArgsConstructor.flagUsage")
    @Parameter(property="lombok.noArgsConstructor.flagUsage")
    String noArgsConstructorFlagUsage;

    /**
     * <p>The type of the exception to throw if a passed-in argument is null (Default: NullPointerException).</p>
     * Example:
     * <pre>
     * &lt;nonNullExceptionType&gt;[NullPointerException | IllegalArgumentException | Assertion | JDK | Guava]&lt;/nonNullExceptionType&gt;
     * </pre>
     */
    @Config("lombok.nonNull.exceptionType")
    @Parameter(property="lombok.nonNull.exceptionType")
    String nonNullExceptionType;

    /**
     * <p>Emit a warning or error if @NonNull is used.</p>
     * Example:
     * <pre>
     * &lt;nonNullFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/nonNullFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.nonNull.flagUsage")
    @Parameter(property="lombok.nonNull.flagUsage")
    String nonNullFlagUsage;

    /**
     * <p>Emit a warning or error if onX is used.</p>
     * Example:
     * <pre>
     * &lt;onXFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/onXFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.onX.flagUsage")
    @Parameter(property="lombok.onX.flagUsage")
    String onXFlagUsage;

    /**
     * <p>Emit a warning or error if @RequiredArgsConstructor is used.</p>
     * Example:
     * <pre>
     * &lt;requiredArgsConstructorFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/requiredArgsConstructorFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.requiredArgsConstructor.flagUsage")
    @Parameter(property="lombok.requiredArgsConstructor.flagUsage")
    String requiredArgsConstructorFlagUsage;

    /**
     * <p>Emit a warning or error if @Setter is used.</p>
     * Example:
     * <pre>
     * &lt;setterFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/setterFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.setter.flagUsage")
    @Parameter(property="lombok.setter.flagUsage")
    String setterFlagUsage;

    /**
     * <p>If true (default): Automatically singularize the assumed-to-be-plural name of your variable/parameter when using @Singular.</p>
     * Example:
     * <pre>
     * &lt;singularAuto&gt;[false | true]&lt;/singularAuto&gt;
     * </pre>
     */
    @Config("lombok.singular.auto")
    @Parameter(property="lombok.singular.auto")
    String singularAuto;

    /**
     * <p>Generate backing immutable implementations for @Singular on java.util.* types by using guava's ImmutableList, etc. Normally java.util's mutable types are used and wrapped to make them immutable.</p>
     * Example:
     * <pre>
     * &lt;singularUseGuava&gt;[false | true]&lt;/singularUseGuava&gt;
     * </pre>
     */
    @Config("lombok.singular.useGuava")
    @Parameter(property="lombok.singular.useGuava")
    String singularUseGuava;

    /**
     * <p>Emit a warning or error if @SneakyThrows is used.</p>
     * Example:
     * <pre>
     * &lt;sneakyThrowsFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/sneakyThrowsFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.sneakyThrows.flagUsage")
    @Parameter(property="lombok.sneakyThrows.flagUsage")
    String sneakyThrowsFlagUsage;

    /**
     * <p>Emit a warning or error if @StandardException is used.</p>
     * Example:
     * <pre>
     * &lt;standardExceptionFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/standardExceptionFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.standardException.flagUsage")
    @Parameter(property="lombok.standardException.flagUsage")
    String standardExceptionFlagUsage;

    /**
     * <p>Emit a warning or error if @SuperBuilder is used.</p>
     * Example:
     * <pre>
     * &lt;superBuilderFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/superBuilderFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.superBuilder.flagUsage")
    @Parameter(property="lombok.superBuilder.flagUsage")
    String superBuilderFlagUsage;

    /**
     * <p>Emit a warning or error if @Synchronized is used.</p>
     * Example:
     * <pre>
     * &lt;synchronizedFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/synchronizedFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.synchronized.flagUsage")
    @Parameter(property="lombok.synchronized.flagUsage")
    String synchronizedFlagUsage;

    /**
     * <p>When generating toString for classes that extend something (other than Object), either automatically take into account superclass implementation (call), or don't (skip), or warn and don't (warn). (default = skip).</p>
     * Example:
     * <pre>
     * &lt;toStringCallSuper&gt;[CALL | SKIP | WARN]&lt;/toStringCallSuper&gt;
     * </pre>
     */
    @Config("lombok.toString.callSuper")
    @Parameter(property="lombok.toString.callSuper")
    String toStringCallSuper;

    /**
     * <p>Don't call the getters but use the fields directly in the generated toString method (default = false).</p>
     * Example:
     * <pre>
     * &lt;toStringDoNotUseGetters&gt;[false | true]&lt;/toStringDoNotUseGetters&gt;
     * </pre>
     */
    @Config("lombok.toString.doNotUseGetters")
    @Parameter(property="lombok.toString.doNotUseGetters")
    String toStringDoNotUseGetters;

    /**
     * <p>Emit a warning or error if @ToString is used.</p>
     * Example:
     * <pre>
     * &lt;toStringFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/toStringFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.toString.flagUsage")
    @Parameter(property="lombok.toString.flagUsage")
    String toStringFlagUsage;

    /**
     * <p>Include the field names in the generated toString method (default = true).</p>
     * Example:
     * <pre>
     * &lt;toStringIncludeFieldNames&gt;[false | true]&lt;/toStringIncludeFieldNames&gt;
     * </pre>
     */
    @Config("lombok.toString.includeFieldNames")
    @Parameter(property="lombok.toString.includeFieldNames")
    String toStringIncludeFieldNames;

    /**
     * <p>Include only fields/methods explicitly marked with @ToString.Include. Otherwise, include all non-static, non-dollar-named fields (default = false).</p>
     * Example:
     * <pre>
     * &lt;toStringOnlyExplicitlyIncluded&gt;[false | true]&lt;/toStringOnlyExplicitlyIncluded&gt;
     * </pre>
     */
    @Config("lombok.toString.onlyExplicitlyIncluded")
    @Parameter(property="lombok.toString.onlyExplicitlyIncluded")
    String toStringOnlyExplicitlyIncluded;

    /**
     * <p>Emit a warning or error if @UtilityClass is used.</p>
     * Example:
     * <pre>
     * &lt;utilityClassFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/utilityClassFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.utilityClass.flagUsage")
    @Parameter(property="lombok.utilityClass.flagUsage")
    String utilityClassFlagUsage;

    /**
     * <p>Emit a warning or error if 'val' is used.</p>
     * Example:
     * <pre>
     * &lt;valFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/valFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.val.flagUsage")
    @Parameter(property="lombok.val.flagUsage")
    String valFlagUsage;

    /**
     * <p>Emit a warning or error if @Value is used.</p>
     * Example:
     * <pre>
     * &lt;valueFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/valueFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.value.flagUsage")
    @Parameter(property="lombok.value.flagUsage")
    String valueFlagUsage;

    /**
     * <p>Emit a warning or error if 'var' is used.</p>
     * Example:
     * <pre>
     * &lt;varFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/varFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.var.flagUsage")
    @Parameter(property="lombok.var.flagUsage")
    String varFlagUsage;

    /**
     * <p>Emit a warning or error if @With is used.</p>
     * Example:
     * <pre>
     * &lt;withFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/withFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.with.flagUsage")
    @Parameter(property="lombok.with.flagUsage")
    String withFlagUsage;

    /**
     * <p>Emit a warning or error if @WithBy is used.</p>
     * Example:
     * <pre>
     * &lt;withByFlagUsage&gt;[WARNING | ERROR | ALLOW]&lt;/withByFlagUsage&gt;
     * </pre>
     */
    @Config("lombok.withBy.flagUsage")
    @Parameter(property="lombok.withBy.flagUsage")
    String withByFlagUsage;

}