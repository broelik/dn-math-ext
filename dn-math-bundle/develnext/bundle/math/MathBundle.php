<?php
namespace develnext\bundle\math;

use ide\bundle\AbstractBundle;
use ide\bundle\AbstractJarBundle;
use ide\project\behaviours\GuiFrameworkProjectBehaviour;
use ide\project\Project;
/**
 * Class MathBundle
 */
class MathBundle extends AbstractJarBundle
{
    public function isAvailable(Project $project)
    {
        return $project->hasBehaviour(GuiFrameworkProjectBehaviour::class);
    }
}