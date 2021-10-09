package org.xtext.example.mydsl.generator;

import java.util.Set;

import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.generator.OutputConfigurationProvider;

public class MyDslOutputConfigurationProvider extends OutputConfigurationProvider {
@Override
public Set<OutputConfiguration> getOutputConfigurations() {
	Set<OutputConfiguration> outputConfigurations = super.getOutputConfigurations();
	OutputConfiguration sqlOutput = new OutputConfiguration("SQL");
	sqlOutput.setDescription("Output Folder");
	sqlOutput.setOutputDirectory("./sql-gen");
	sqlOutput.setOverrideExistingResources(true);
	sqlOutput.setCreateOutputDirectory(true);
	sqlOutput.setCleanUpDerivedResources(true);
	sqlOutput.setSetDerivedProperty(true);
	sqlOutput.setKeepLocalHistory(true);
	outputConfigurations.add(sqlOutput);
	return outputConfigurations;
}
}
